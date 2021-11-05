package com.example.nepalprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nepalprojekt.ui.theme.NepalprojektTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*NepalprojektTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(name = "Android")

                }
            }*/
            Column (modifier = Modifier
                .fillMaxSize()
                //.fillMaxWidth()
                //.border(5.dp, Color.Green)
                //.padding(16.dp)
                //.background(Color.Magenta),
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                MainMenuElement(
                    title = "Sundhedsinfo Barn"
                )
                //Spacer(modifier = Modifier.height(50.dp))
                MainMenuElement(
                    title = "Sundhedsinfo Forældre"
                )
                Text("Hello", modifier = Modifier.clickable {  })
                Text("World", modifier = Modifier
                    //.draggable()
                    .offset(50.dp, 20.dp))

            }
            /*//val painter = painterResource(id = R.drawable.kermit)
            val description = "Kermit playing in the snow"
            val title = "Kermit playing in the snow"
            ImageCard(
                //painter = painter,
                contentDescription = description,
                title = title
            )*/
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Android")
}

@Composable
fun MainMenuElement(
    title: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .clickable { }
            .background(Color(0xFF101010))
            .padding(10.dp),
        //shape = RoundedCornerShape(15.dp)
    ) {
        Text(title,
             style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center))
    }
}

@Composable
fun ImageCard(
    //painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(), //default
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            /*Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
                )*/
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}