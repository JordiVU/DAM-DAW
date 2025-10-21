package edu.jordivazquez.t2_ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import edu.jordivazquez.t2_ejemplo1.ui.theme.T2_Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            T2_Ejemplo1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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
    T2_Ejemplo1Theme {
        Greeting("Android")
    }
}

@Composable
fun LayoutPersonalizadoDemo() {
    Box(
        modifier = Modifier
            .wrapContentHeight() // Se ajusta al contenido
            .background(Color(0xFFEFEFEF)) // Fondo gris claro
            .centroManual() // Modificador personalizado
    ) {
        Text(
            text = "Texto centrado con layout personalizado",
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}

fun Modifier.centroManual(): Modifier = this.then(
    Modifier.layout { measurable, constraints ->
        // Se mide el hijo con las restricciones.
        val placeable = measurable.measure(constraints)

        // Se calcula el tamaño total del padre.
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        // se calcula la posición centrada.
        val x = (width - placeable.width) / 2
        val y = (height - placeable.height) / 2

        // Se devuelve el layout y se coloca el hijo.
        layout(width, height) {
            placeable.place(x, y)
        }
    }
)

@Preview(showBackground = true)
@Composable
fun VistaPreviaLayoutPersonalizado() {
    LayoutPersonalizadoDemo()
}