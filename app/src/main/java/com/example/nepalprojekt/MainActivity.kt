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
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
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
import kotlinx.coroutines.launch
import javax.security.auth.Subject

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
                .background(Color(0xffeba6f3))
                //.background(Color(0xeba6f3))
                //.fillMaxWidth()
                //.border(5.dp, Color.Green)
                //.padding(16.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                MainMenu()
                //Spacer(modifier = Modifier.height(50.dp))

            }
            /*//val painter = painterResource(id = R.drawable.)
            val description = ""
            val title = ""
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
fun MainMenu(
    modifier: Modifier = Modifier
) {
    MainMenuRow(title = "Health Info", subject1 = "Child", subject2 = "Parent")
    MainMenuRow(title = "Recipes", subject1 = "Child", subject2 = "Parent")
}

@Composable
fun MainMenuRow(
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
            Text(title,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center)//.offset(40.dp, 40.dp))
            )

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

@Composable
fun MainMenuElement(
    subject: String,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp,
        modifier = Modifier
            .padding(5.dp)
    ) {
        Box(
            modifier = Modifier
                .clickable { }
                .background(Color(0xFF101010))
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





/* Below is exercise code, used as inspiration
*
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
*/
/* Textfields, Buttons and showing snackbars
*
* val scaffoldState = rememberScaffoldState()
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            Scaffold(modifier = Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    TextField(
                        value = textFieldState,
                        label = {
                            Text("Enter your name")
                        },
                        onValueChange = { //called whenever the user changes something
                            textFieldState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                        }
                    }) {
                        Text("Pls greet me")
                    }
                }
            }*/