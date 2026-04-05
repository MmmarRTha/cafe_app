package com.marthanieto.cafeapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marthanieto.cafeapp.R
import com.marthanieto.cafeapp.ui.theme.Brown

@Composable
@Preview
fun SplashScreen() {
    val stashFont= FontFamily(Font(R.font.stash))
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.black))
    ){
        Image(
            painter = painterResource(R.drawable.splash_pic),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.TopCenter),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Brown,
                contentColor = Color.White
            )
        ) {
            Text(text = "Get Started", fontSize = 16.sp)
        }
        Text(
            text = stringResource(id = R.string.welcome),
            fontFamily = stashFont,
            color = colorResource(R.color.white),
            fontSize = 66.sp,
            textAlign = TextAlign.Center,
            lineHeight = 300.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
        )

    }
}