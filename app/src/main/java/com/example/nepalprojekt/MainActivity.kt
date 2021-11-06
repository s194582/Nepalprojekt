package com.example.nepalprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val painter = painterResource(id = R.drawable.background1)

            MainMenu(painter = painter)

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
fun MainMenu(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painter,
            contentDescription = "backgroundPhoto",
            contentScale = ContentScale.FillBounds
        ) }
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,

    ) {

        MainMenuRow(title = "Health Info", subject1 = "Parent", subject2 = "Child")
        MainMenuRow(title = "Recipes", subject1 = "Parent", subject2 = "Child")

    }


}

@Composable
fun MainMenuRow( // Grøn box
    title: String,
    subject1: String,
    subject2: String,
    //modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(10.dp), //rounded corners of outer box
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Box (
            modifier = Modifier
                .background(Color.Green)
                .padding(10.dp) //between inner and outer box
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly) {
                Text(title,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center)//.offset(40.dp, 40.dp))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MainMenuElement(
                        subject = subject1
                    )
                    MainMenuElement(
                        subject = subject2
                    )
                }
            }

        }

    }
}

@Composable
fun MainMenuElement( //Sort box
    subject: String,
    modifier: Modifier = Modifier
) {//val scope = rememberCoroutineScope()
    //val recipes = Recipes()
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp,
        modifier = Modifier
            .padding(5.dp)
        ) {
    /*Button(onClick = {navController.nav}) {

    }*/
    Box(
            modifier = Modifier
                .clickable { }
                .background(Color(0xFFb533b3))
                .padding(10.dp)
        ) {
            Text(subject,
                 style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center))
        }
    }

}