package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                    GrettingPreview()
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GrettingPreview(){
    Content("Hola","Mundo")
}


@Composable
fun Content(mensaje1:String,mensaje2:String){
    Column{
        Text(mensaje1, fontSize = 30.sp)
        Text(mensaje2, lineHeight = 30.sp)
        Text("Luis", fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            lineHeight = 32.sp)
    }
}