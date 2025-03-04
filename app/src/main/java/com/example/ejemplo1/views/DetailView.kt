package com.example.ejemplo1.views

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.ActionButton
import com.example.ejemplo1.components.MainIconButton
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.views.TitleView


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(name = "Detail View") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack){
                        navController.popBackStack()
                    }
                }
            )

        },
        floatingActionButton ={
            ActionButton(color = Color.Blue)
        }
    )
    {
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController){
    LazyColumn {
        item {
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Hola",
                Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}