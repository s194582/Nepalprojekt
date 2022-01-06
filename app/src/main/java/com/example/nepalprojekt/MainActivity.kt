package com.example.nepalprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.ui.theme.Navigation
import com.example.nepalprojekt.ui.theme.Screen

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
            Navigation()

            val painter = painterResource(id = R.drawable.background1) // For designed background

            //MainMenu(painter = painter)

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
        navController: NavController,
        //painter: Painter,
        modifier: Modifier = Modifier
) {
    /*var text by remember {
        mutableStateOf("")
    }
    TextField(value = text, onValueChange = {text = it})
    Button(onClick = { navController.navigate(Screen.RecipeAdultScreen.route) }) {
        Text(text = "Test going to RecipeScreen")
    }*/
    Box(
            modifier = Modifier.fillMaxSize()
    ){
        /*Image(
            painter = painter,
            contentDescription = "backgroundPhoto",
            contentScale = ContentScale.FillBounds
        )*/ }
    Column (modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
    ) {

        HealthRow(title = "Health Info", subject1 = "Parent", subject2 = "Child", navController = navController)
        RecipeRow(title = "Recipes", subject1 = "Parent", subject2 = "Child", navController = navController)

    }


}
/*
@Composable
fun MainMenuRow( // Grøn box
    navController: NavController,
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
                        subject = subject1,
                        navController = navController
                    )
                    MainMenuElement(
                        subject = subject2,
                        navController = navController
                    )
                }
            }
        }
    }
}
*/
/**
 * Health info
 */
@Composable
fun HealthRow( // Box containing two buttons for health info
        navController: NavController,
        title: String,
        subject1: String,
        subject2: String
) {
    Card( // for rounded shape
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
                    ButtonElement(
                            subject = subject1
                    ) { navController.navigate(Screen.RecipeAdultScreen.route) } //<-route for onClick for button
                    ButtonElement(
                            subject = subject2
                    ) { navController.navigate(Screen.RecipeChildren.route) }
                }
            }
        }
    }
}

/**
 * Recipes
 */
@Composable
fun RecipeRow( // Box containing two buttons for recipes
        navController: NavController,
        title: String,
        subject1: String,
        subject2: String
) {
    Card( // for rounded shape
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
                    ButtonElement(
                            subject = subject1
                    ) { navController.navigate(Screen.RecipeAdultScreen.route) }
                    ButtonElement(
                            subject = subject2
                    ) { navController.navigate(Screen.RecipeAdultScreen.route) }
                }
            }
        }
    }
}

/**
 * Reusable button element
 * Holds a subject and an onClick function
 */
@Composable
fun ButtonElement(
        subject: String,
        onClick: () -> Unit
) {
    Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 5.dp,
            modifier = Modifier
                    .padding(5.dp)
    ) {
        Button(onClick = onClick //Creates reusable button function
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