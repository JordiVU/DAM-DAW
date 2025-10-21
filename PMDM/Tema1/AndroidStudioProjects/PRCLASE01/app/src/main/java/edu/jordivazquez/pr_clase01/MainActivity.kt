package edu.jordivazquez.pr_clase01

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import edu.jordivazquez.pr_clase01.ui.theme.PRCLASE01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PRCLASE01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(paddingValues = innerPadding)) {
                        FormularioUsuario(Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun FormularioUsuario(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var name by remember { mutableStateOf("") }
            var surnames by remember { mutableStateOf("") }
            val nameCompl by remember { derivedStateOf{ name.length > 0} }
            val surnameCompl by remember { derivedStateOf{ surnames.length > 0} }

            TextField(
                value = name,
                onValueChange = {name = it},
                label = {Text("Nombre...")}
            )
            TextField(
                value = surnames,
                onValueChange = {surnames = it},
                label = {Text("Apellidos...")}
            )
            if(name == "" || surnames == "") {
                Text(
                    text = "Introduce nombres y apellidos"
                )
            } else
            {
                Text(
                    text = "${name} ${surnames}"
                )
            }
            Button (
                onClick = {
                    name = ""
                    surnames = ""
                }
            ) {
                Text("LIMPIAR")
            }
            if(nameCompl && surnameCompl) {
                val context = LocalContext.current
                Button(
                    onClick = {
                        Toast.makeText(context, "¡Hola, ${name} ${surnames}!", Toast.LENGTH_SHORT).show()
                    }
                ) {
                        Text("SALUDAR")
                    }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PRCLASE01Theme {
        Greeting("Android")
    }
}