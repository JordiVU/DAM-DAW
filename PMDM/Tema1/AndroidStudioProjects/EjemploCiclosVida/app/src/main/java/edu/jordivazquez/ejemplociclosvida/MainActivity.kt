package edu.jordivazquez.ejemplociclosvida

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.jordivazquez.ejemplociclosvida.ui.theme.EjemploCiclosVidaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity","OnCreate")
        enableEdgeToEdge()
        setContent {
            EjemploCiclosVidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","OnDestroy")
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
    EjemploCiclosVidaTheme {
        Greeting("Android")
    }
}