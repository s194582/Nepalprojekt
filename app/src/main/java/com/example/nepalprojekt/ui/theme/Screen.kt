package com.example.nepalprojekt.ui.theme
//Navigation inspiration from Philipp Lackner, Jetpack Compose Navigation for Beginners - Android Studio Tutorial, https://www.youtube.com/watch?v=4gUeyNkGE3g
//Sealed classes only allows classes inside of the class itself to inherit from it
sealed class Screen(val route:String) {
    object MainMenu : Screen("main_menu")
    object RecipeAdultScreen : Screen("recipe_adult_screen")
    object RecipeChildren : Screen("recipes_child")
}