package com.example.thecontroll_of_your_life_inator

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.thecontroll_of_your_life_inator.ui.theme.TheControllOfYourLifeINATORTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheControllOfYourLifeINATORTheme {
        AndroidView(
            factory = { context ->
                LayoutInflater.from(context).inflate(R.layout.activity_main, null)
            },
            update = {}
        )
    }
}