package com.example.nepalprojekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.ui.theme.Navigation
import com.example.nepalprojekt.ui.theme.NepalprojektTheme
import com.example.nepalprojekt.ui.theme.Screen

val Violet = Color(0xFFe1bee7)
val newViolet = Color(0xFFf4d4fa)
val seafoam = Color(0xffe0f2f1)
val purple = Color(0xff6633FF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NepalprojektTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = newViolet, //color = MaterialTheme.colors.background
                        modifier = Modifier.fillMaxSize(1f)
                ) {

                    Navigation()

                }
            }
            /*MaterialTheme (colors = if (DarkTheme) DarkColors else LightColors) {

            }*/



            val painter = painterResource(id = R.drawable.background1) // For designed background
            
        }
    }
}

@Composable
fun MainMenu(
    navController: NavController
) {
    Card (modifier = Modifier.fillMaxSize(),
        shape = RectangleShape
    ) {
        Image(painter = painterResource(id = R.drawable.logo_background), contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
            ) {

            HealthRow(
                title = stringResource(id = R.string.health_information),
                subject1 = stringResource(id = R.string.general_information),
                subject2 = stringResource(id = R.string.children),
                navController = navController
            )
            RecipeRow(
                title = stringResource(id = R.string.recipes),
                subject1 = stringResource(id = R.string.parents),
                subject2 = stringResource(id = R.string.children),
                navController = navController
            )
            Spacer(modifier = Modifier.padding(10.dp))
        }
    }
}

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
        border = BorderStroke(width = 4.dp, color = colors.primary),
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Box (
            modifier = Modifier
                .background(newViolet)
                .padding(10.dp) //between inner and outer box
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly) {
                Text(title,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center)//.offset(40.dp, 40.dp))
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ButtonElement(
                        subject = subject1
                    ) { navController.navigate(Screen.HealthInfoGeneral.route) } //<-route for onClick for button
                    ButtonElement(
                        subject = subject2
                    ) { navController.navigate(Screen.HealthInfoChild.route) }
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
        border = BorderStroke(width = 4.dp, color = MaterialTheme.colors.primary),
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Box (
            modifier = Modifier
                .background(newViolet)
                .padding(10.dp) //between inner and outer box
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly) {
                Text(title,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center)//.offset(40.dp, 40.dp))
                )
                Spacer(modifier = Modifier.height(6.dp))
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
                    ) { navController.navigate(Screen.RecipesChildScreen.route) }
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