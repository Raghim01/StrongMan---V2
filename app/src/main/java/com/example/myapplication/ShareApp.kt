package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.components.MyProfilePageBarr
import androidx.compose.material.Button

@Composable
fun ShareScreen(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        Text()
        ShareButton()
    }
}
@Preview
@Composable
fun Text(){
    Text(
        modifier = Modifier
            .padding(top = 100.dp),
        text = stringResource(id = R.string.share_app),
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontSize = 30.sp
    )
}

@Composable
fun ShareButton(){
    //val link = R.string.git_link
    val sentIntent : Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(
            Intent.EXTRA_TEXT,
            "https://github.com/Raghim01/StrongMan")
        type = "text/plain"
    }
    val shareIntent = Intent.createChooser(sentIntent,null)
    val context = LocalContext.current

    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 150.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier
                .height(60.dp)
                .width(150.dp),
            onClick = {
                context.startActivity(shareIntent)
            }
        ) {
            Text(text = "Share")
        }
    }
}