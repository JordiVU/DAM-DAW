package com.example.ejemplotest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplotest.ui.theme.EjemploTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjemploTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Contador(Modifier.padding(paddingValues = innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Contador(modifier: Modifier = Modifier) {

    var contador by remember { mutableStateOf(value = 0) } // Esto es un estado que se guarda.

    Column (modifier = modifier){
        Text("Valor: $contador")
        //Log.d(tag = "Contador", msg = "Valor del contador: $contador")
        Button(onClick = { contador++ }) {
            Text("Incrementar")
        }
    }
}