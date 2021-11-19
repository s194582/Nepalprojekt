package com.example.nepalprojekt.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
//import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.nepalprojekt.MainActivity
import com.example.nepalprojekt.MainMenu

/**
 * Navigation inspiration from Philipp Lackner, Jetpack Compose Navigation for Beginners - Android Studio Tutorial,
 * https://www.youtube.com/watch?v=4gUeyNkGE3g*/
@Composable
fun Navigation() {
    val navController = rememberNavController() //Creating NavController, the central API for the Navigation component
    NavHost(navController = navController, startDestination = Screen.MainMenu.route) {
        composable(route = Screen.MainMenu.route) {
            MainMenu(navController = navController)
        }
        composable( route = Screen.RecipeAdultScreen.route //+ "?name={name}",
                /*arguments = listOf(
                    navArgument("testNavArgument") {
                        type = NavType.StringType
                        defaultValue = "default recipe"
                        nullable = true
                    }
                )*/
            ) { //entry ->
            Recipes()//name = entry.arguments?.getString("name"))
        }
    }
}