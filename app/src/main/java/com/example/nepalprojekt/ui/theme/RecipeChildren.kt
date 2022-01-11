package com.example.nepalprojekt.ui.theme

//Forsøges omskrives til en sidde med knapper.

import android.icu.text.CaseMap
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.ButtonElement
import com.example.nepalprojekt.HealthRow
import com.example.nepalprojekt.RecipeRow
import org.w3c.dom.Text


@Composable
fun RecipeListChildren(
    navController: NavController,
    //painter: Painter,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ){
    }
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        /*HealthRow(title = "Health Info", subject1 = "Parent", subject2 = "Child", navController = navController)
        RecipeRow(title = "Recipes", subject1 = "Parent", subject2 = "Child", navController = navController)
        */
        Recipe1(title = "Recipe 1", Recipe1 = "See Recipe", Test1 = "Child", navController = navController)
        Recipe2(title = "Recipe 2", Recipe2 = "See Recipe", Test2 = "Child", navController = navController)
        Recipe3(title = "Recipe 3", Recipe3 = "See Recipe", Test3 = "Child", navController = navController)
        Recipe4(title = "Recipe 4", Recipe4 = "See Recipe", Test4 = "Child", navController = navController)
    }
}

@Composable
fun Recipe1(
    navController: NavController,
    title: String,
    Recipe1: String,
    Test1: String,
) {
    Card( // for rounded shape
        shape = RoundedCornerShape(10.dp), //rounded corners of outer box
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )//.offset(40.dp, 40.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))

            ButtonElement(subject = Recipe1) {
                navController.navigate(Screen.FirstRecipeChild.route)
            }
        }
    }
}

@Composable
fun Recipe2(
    navController: NavController,
    title: String,
    Recipe2: String,
    Test2: String,
) {
    Card( // for rounded shape
        shape = RoundedCornerShape(10.dp), //rounded corners of outer box
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )//.offset(40.dp, 40.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))

            ButtonElement(subject = Recipe2) {
                navController.navigate(Screen.SecondRecipeChild.route)
            }
        }
    }
}

@Composable
fun Recipe3(
    navController: NavController,
    title: String,
    Recipe3: String,
    Test3: String,
) {
    Card( // for rounded shape
        shape = RoundedCornerShape(10.dp), //rounded corners of outer box
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )//.offset(40.dp, 40.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))

            ButtonElement(subject = Recipe3) {
                navController.navigate(Screen.ThirdRecipeChild.route)
            }
        }
    }
}

@Composable
fun Recipe4(
    navController: NavController,
    title: String,
    Recipe4: String,
    Test4: String,
) {
    Card( // for rounded shape
        shape = RoundedCornerShape(10.dp), //rounded corners of outer box
        modifier = Modifier
            .padding(10.dp), //around outer box
        elevation = 20.dp //still don't know what it does
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )//.offset(40.dp, 40.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))

            ButtonElement(subject = Recipe4) {
                navController.navigate(Screen.FourthRecipeChild.route)
            }
        }
    }
}

/*
@Composable
fun RecipeChild( // Box containing two buttons for health info
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
                    //{ navController.navigate(Screen.RecipeChildren.route) }
                }
            }
        }
    }
}*/