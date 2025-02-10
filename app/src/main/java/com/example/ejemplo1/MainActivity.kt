package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
                Content()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Content(){
    Text(
        text = "Hola Jetpack Compose",
        color = Color.Red,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
    /**Modificadores
     * De posicicionamiento = width, height, top, buttom, start, end
     * De funcionalidad = click, scroll
     * De apariencia = background, padding, border
     */
}