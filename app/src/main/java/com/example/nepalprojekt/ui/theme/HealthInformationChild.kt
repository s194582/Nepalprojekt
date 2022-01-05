package com.example.nepalprojekt.ui.theme

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
//@ExperimentalFoundationApi
@Composable
fun HealthChild (
    navController: NavController
) {
    var expanded = rememberSaveable { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded
    val extraPadding by animateDpAsState( //animates extraPadding
        if (expanded.value) 48.dp else 0.dp
    )

    Surface (
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row (modifier = Modifier.padding(24.dp)
        ) {
            Column (modifier = Modifier
                .weight(1f)
                .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello, ")
                Text(text = "World")
            }
            OutlinedButton(
                onClick = { expanded.value = !expanded.value }
            ) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }


        /*LazyColumn {
            /*stickyHeader { //Experimental API
                Header()
            }*/

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
         */

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