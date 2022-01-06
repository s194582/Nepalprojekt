package com.example.nepalprojekt.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Recipes(
        navController: NavController
) {
    var text by remember {
        mutableStateOf("")
    }
    TextField(value = text, onValueChange = {text = it})
    Button(onClick = { navController.navigate(Screen.MainMenu.route) }) {
        Text(text = "Back to main menu!")
    }
    LazyColumn { //only loads items if scrolled by
        itemsIndexed(
                listOf(
                        "Recipe 1",
                        "Recipe 2",
                        "Recipe 3",
                        "Recipe 4",
                        "Recipe 5",
                        "Recipe 6",
                        "Recipe 7",
                        "Recipe 8",
                        "Recipe 9",
                        "Recipe 10",
                        "Recipe 11",
                        "Recipe 12",
                        "Recipe 13",
                        "Recipe 14"
                )
        ) { index, string ->
            Button(onClick = { navController.navigate(Screen.MainMenu.route) }) {
                Text(
                        text = string,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 24.dp)
                )
            }
        }
    }
}
