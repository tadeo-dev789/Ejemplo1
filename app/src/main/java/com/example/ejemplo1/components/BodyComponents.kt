package com.example.ejemplo1.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun TitleView(name:String){
    Text(text = "Home", fontSize = 30.sp, color = Color.Black)
}