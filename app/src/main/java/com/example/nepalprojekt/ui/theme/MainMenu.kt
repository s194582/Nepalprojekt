package com.example.nepalprojekt.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.navigation.Screen

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
                        textAlign = TextAlign.Center)
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