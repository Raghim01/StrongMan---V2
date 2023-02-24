package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.widget.Space
import androidx.annotation.StringRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.components.MyProfilePageBarr
import androidx.compose.material.Button
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext


@Composable
fun RatePageScreen(navController:NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        ThxText()
        Button()
    }
}
@Preview
@Composable
fun ThxText(){
        Text(
            modifier = Modifier
                .padding(top = 100.dp),
            text = stringResource(id = R.string.rate_app),
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontSize = 30.sp
        )
}

@Composable
fun Button(){
    val context = LocalContext.current
    val intent = remember{ Intent (Intent.ACTION_VIEW, Uri.parse("https://github.com/Raghim01/StrongMan"))}
    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 250.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier.height(60.dp).width(150.dp),
                    onClick = { context.startActivity(intent) }
        ) {
            Text(text = "Rate")
        }
    }
}