package edu.jordivazquez.t2_ejemplosgraficos

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ModificadoresDemo() {
    var isHovered by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text("1. Orden: Padding antes de Background")
        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Red)
        ) {
            Text(
                "Texto con padding interno",
                modifier = Modifier.padding(8.dp)
            )
        }

        Text("2. Orden: Background antes de Padding")
        Box(
            modifier = Modifier
                .background(Color.Green)
                .padding(16.dp)
        ) {
            Text(
                "Texto con fondo más grande",
                modifier = Modifier.padding(8.dp)
            )
        }

        Text("3. Modificador personalizado: tarjetaRedonda")
        Box(
            modifier = Modifier.tarjetaRedonda()
        ) {
            Text(
                "Texto dentro de tarjeta",
                modifier = Modifier.padding(16.dp)
            )
        }

        val context = LocalContext.current
        Text("4. Con `clickable` (logcat)")
        Box(
            modifier = Modifier
                .tarjetaRedonda()
                .clickable {
                    Log.d("Compose", "Tarjeta clicada")
                    Toast.makeText(context, "Tarjeta clicada", Toast.LENGTH_SHORT).show()
                }
        ) {
            Text(
                "Haz clic en esta tarjeta",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

// Modificador personalizado
fun Modifier.tarjetaRedonda(): Modifier = this
    .padding(8.dp)
    .clip(RoundedCornerShape(16.dp))
    .background(Color.White)
    .border(2.dp, Color.Gray, RoundedCornerShape(16.dp))