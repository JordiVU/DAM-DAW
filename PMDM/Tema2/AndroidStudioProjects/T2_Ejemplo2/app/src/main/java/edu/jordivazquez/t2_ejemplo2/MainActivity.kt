package edu.jordivazquez.t2_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.jordivazquez.t2_ejemplo2.ui.theme.T2_Ejemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            T2_Ejemplo2Theme {
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

fun Modifier.limitarAnchoAl50Porciento(): Modifier = this.then(
    Modifier.layout { measurable, constraints ->
        // Se calcula el 50% del ancho disponible.
        val anchoDisponible = constraints.maxWidth
        val anchoLimitado = anchoDisponible / 2

        // Se crean nuevas restricciones con ancho máximo reducido.
        val newConstraints = constraints.copy(maxWidth = anchoLimitado)

        // Se mide el hijo con esas restricciones.
        val placeable = measurable.measure(newConstraints)

        // La altura del padre será la del hijo, ancho será el original.
        layout(anchoDisponible, placeable.height) {
            // Se centra horizontalmente
            val x = (anchoDisponible - placeable.width) / 2
            placeable.place(x, 0)
        }
    }
)

@Composable
fun LayoutAnchoLimitadoDemo() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color(0xFFEFEFEF))
            .limitarAnchoAl50Porciento()
    ) {
        Text(
            text = "Ancho limitado al 50%",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun VistaPreviaAnchoLimitado() {
    LayoutAnchoLimitadoDemo()
}

