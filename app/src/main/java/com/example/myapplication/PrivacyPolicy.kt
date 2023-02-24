package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.components.MyProfilePageBarr

@Composable
fun PrivacyPolicy(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        PPText()
    }
}
@Preview
@Composable
fun PPText(){
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 5.dp, end = 5.dp, bottom = 20.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.LightGray),
        elevation = 5.dp
    ) {

        Text(
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp, top = 5.dp)
                .verticalScroll(rememberScrollState()),
            text = stringResource(id = R.string.privacy_policy),
        )

    }
}