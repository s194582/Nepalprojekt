package com.example.nepalprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.nepalprojekt.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NepalprojektTheme {
                // A surface container using a chosen 'background' color, which hosts the view
                Surface(color = newViolet,
                        modifier = Modifier.fillMaxSize(1f)
                ) {

                    Navigation()

                }
            }
        }
    }
}