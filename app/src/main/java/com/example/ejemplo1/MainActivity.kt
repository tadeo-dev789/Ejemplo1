package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                Content()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content() {
    var valor1 by remember { mutableStateOf(TextFieldValue("")) }
    var valor2 by remember { mutableStateOf(TextFieldValue("")) }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.25f) // Ocupa 1/4 de la altura de la pantalla
        ) {
            Image(
                painter = painterResource(id = R.drawable.utiles),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        // TextField para el primer valor
        TextField(
            value = valor1,
            onValueChange = { valor1 = it },
            label = { Text(text = "Valor 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Ingresa el valor 1") }
        )

        // TextField para el segundo valor
        TextField(
            value = valor2,
            onValueChange = { valor2 = it },
            label = { Text(text = "Valor 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Ingresa el valor 2") }
        )

        // Botón para calcular
        Button(onClick = {
            val num1 = valor1.text.toDoubleOrNull() ?: 0.0
            val num2 = valor2.text.toDoubleOrNull() ?: 0.0
            resultado = (num1 + num2).toString()
        }) {
            Text(text = "Calcular")
        }

        // Mostrar resultado
        if (resultado.isNotEmpty()) {
            Text(text = "Resultado: $resultado", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
