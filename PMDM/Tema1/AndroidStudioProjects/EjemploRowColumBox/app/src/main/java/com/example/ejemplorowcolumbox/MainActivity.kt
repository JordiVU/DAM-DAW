package com.example.ejemplorowcolumbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplorowcolumbox.ui.theme.EjemploRowColumBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjemploRowColumBoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        /*EjemploColumn()
                        EjemploRow()
                        EjemploBox()*/
                        MainScrean()
                    }
                }
            }
        }
    }
}

@Composable
fun EjemploColumn() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Primera línea")
        Text("Segunda línea")
    }
}

@Composable
fun EjemploRow() {
    Row(modifier = Modifier.padding(16.dp)) {
        Text("Izquierda")
        Spacer(modifier = Modifier.width(8.dp))
        Text("Derecha")
    }
}

@Composable
fun EjemploBox() {
    Box(modifier = Modifier.size(100.dp)) {
        Text("Fondo", modifier = Modifier.align(Alignment.Center))
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Red)
            .align(Alignment.BottomEnd))
    }
}

@Preview
@Composable
fun MainScrean() {
    var texto by remember { mutableStateOf("") }
    val esTextoLargo by remember {
        derivedStateOf { texto.length > 10 }
    }

    OutlinedTextField(
        value = texto,
        onValueChange = { texto = it},
        label = { Text( text = "Introduce texto")},
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
    if(esTextoLargo) {
        Text (
            text = texto, modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}