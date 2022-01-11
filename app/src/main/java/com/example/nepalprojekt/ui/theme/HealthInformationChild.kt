package com.example.nepalprojekt.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun HealthChild (
    navController: NavController
) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        InfoBoxes(title = "० - ६ महिना", description = "description1") {
            navController.navigate(Screen.ZeroSix.route)
        } // 0-6 months
        InfoBoxes(title = "६ - ९ महिना", description = "description2") {
            navController.navigate(Screen.SixNine.route)
        } // 6-9 months
        InfoBoxes(title = "९ - १२ महिना", description = "description3") {
            navController.navigate(Screen.NineTwelve.route)
        } // 9-12 months
        InfoBoxes(title = "१२ - २४ महिना", description = "description4") {
            navController.navigate(Screen.TwelveTwentyFour.route)
        } // 12-24 months
    }
}

/**
 * Each box containing health information
 * In a Card shape, making rounded edges possible
 */
@Composable
fun InfoBoxes (
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        InfoElement(title, description, onClick)
    }
}

/**
 * Modifications and animation for each health info element
 */
@Composable
fun InfoElement(
    title: String,
    description: String,
    onClick: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded

    Row (modifier = Modifier
        .padding(12.dp)
        .animateContentSize( //animateContentSize automates the process of creating the animation (replaces extraPadding)
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    ) {
        Column (modifier = Modifier
            .weight(1f)
            .padding(12.dp)
        ) {
            Text(title) //Place of title of each element

            if (expanded) {
                Text(description) //Place of description of each element
            }

            IconButton(onClick = onClick) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,

                    contentDescription = (if (expanded) { //String resources needed to make Icon work. Isn't shown in app.
                        stringResource(R.string.show_less)
                    } else {
                        stringResource(R.string.show_more)
                    })
                )
            }
        }
    }
}