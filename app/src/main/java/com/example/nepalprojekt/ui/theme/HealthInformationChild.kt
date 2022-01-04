package com.example.nepalprojekt.ui.theme

import android.preference.PreferenceActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@ExperimentalFoundationApi
@Composable
fun HealthChild (
    navController: NavController
) {


        LazyColumn {
            stickyHeader { //Experimental API
                Header()
            }

            // Add a single item
            item {
                Text(text = "First item")
            }

            // Add 5 items
            items(5) { index ->
                Text(text = "Item: $index")
            }

            // Add another single item
            item {
                Text(text = "Last item")
            }
        }

}

@Composable
fun Header () {
    Box(
        modifier = Modifier
        .fillMaxWidth()
    ) {
        Text(text = "This is header",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,)
    }
}