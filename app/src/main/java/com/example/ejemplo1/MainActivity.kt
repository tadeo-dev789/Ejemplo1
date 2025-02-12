package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                GreetingPreview()
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Column {
        OutLineTextFieldSample()
        TextFieldWithIcons()
    }
}

@Composable
@Preview(showBackground = true)
fun textFieldSencillo(){
    var text by remember { mutableStateOf("") }
    Column {
        TextField(
            value = text,
            onValueChange = {newText->
                text = newText
            },
            label = { Text("Introduce tu nombre") }
        )
        Text(text = "Tu nombre es: $text")
    }
}

@Composable
@Preview(showBackground = true)
fun textFieldSPlaceHolder(){
    var text by remember { mutableStateOf("") }
    Column {
        TextField(
            value = text,
            onValueChange = {newText->
                text = newText
            },
            label = { Text("Nombre") },
            placeholder = { Text("Introduce tu nombre") }
        )
        Text(text = "Tu nombre es: $text")
    }
}
@Composable
@Preview(showBackground = true)
fun textFieldKeyboard(){
    var text by remember { mutableStateOf("") }
    Column {
        TextField(
            value = text,
            onValueChange = {newText->
                text = newText
            },
            label = { Text("Nombre") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Text(text = "Tu nombre es: $text")
    }
}

@Composable
fun OutLineTextFieldSample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        label = { Text(text = "Enter Your Name") },
        onValueChange = {
            text = it
        }
    )
}

@Composable
fun TextFieldWithIcons() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        value = text,
        leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "emailIcon") },
        //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
        onValueChange = {
            text = it
        },
        label = { Text(text = "Phone number") },
        placeholder = { Text(text = "Enter your phone number") },
    )
}

