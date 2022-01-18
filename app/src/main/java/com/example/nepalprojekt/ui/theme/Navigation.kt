package com.example.nepalprojekt.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nepalprojekt.MainMenu
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.health.NineTwelve
import com.example.nepalprojekt.ui.theme.health.SixNine
import com.example.nepalprojekt.ui.theme.health.TwelveTwentyfour
import com.example.nepalprojekt.ui.theme.health.ZeroSix
import com.example.nepalprojekt.ui.theme.recipes.RecipesAdult
import com.example.nepalprojekt.ui.theme.recipes.RecipesChild

/**
 * Navigation inspiration from Philipp Lackner, Jetpack Compose Navigation for Beginners - Android Studio Tutorial,
 * https://www.youtube.com/watch?v=4gUeyNkGE3g*/
@Composable
fun Navigation() {
    val navController = rememberNavController() //Creating NavController, the central API for the Navigation component
    NavHost(navController = navController, startDestination = Screen.MainMenu.route) {
        composable(route = Screen.MainMenu.route
        ) {
            MainMenu(navController = navController, painter = painterResource(id = R.drawable.background1))
        }

        /** Recipes */
        composable(route = Screen.RecipeAdultScreen.route
            ) {
            RecipesAdult(navController = navController)
        }
        composable(route = Screen.RecipesChildScreen.route
        ) {
            RecipesChild(navController = navController)
        }

        /** Health */
        composable(route = Screen.HealthInfoGeneral.route
        ) {
            HealthGeneral(navController = navController)
        }
        composable(route = Screen.HealthInfoChild.route
        ) {
            HealthChild(navController = navController)
        }
        composable(route = Screen.ZeroSix.route
        ) {
            ZeroSix(navController = navController)
        }
        composable(route = Screen.SixNine.route
        ) {
            SixNine(navController = navController)
        }
        composable(route = Screen.NineTwelve.route
        ) {
            NineTwelve(navController = navController)
        }
        composable(route = Screen.TwelveTwentyFour.route
        ) {
            TwelveTwentyfour(navController = navController)
        }
    }
}