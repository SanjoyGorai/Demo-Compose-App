package san.joy.compose.app.gorai

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import san.joy.compose.app.gorai.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Mr. Sanjoy Kumar Gorai")
                    Button(onClick = {
                        Toast.makeText(
                            this,
                            "This is a compose app Kotlin",
                            Toast.LENGTH_SHORT
                        )
                    }) {
                        Text(text = "Hi Guys")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    val context = LocalContext.current

    ComposeAppTheme {
        Greeting("Android")
    }
    Button(onClick = {
        Toast.makeText(
            context,
            "This is a compose app Kotlin",
            Toast.LENGTH_SHORT
        )
    }) {
        Text(text = "Hi Guys")
    }
}