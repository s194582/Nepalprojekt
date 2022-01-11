package com.example.nepalprojekt.ui.theme


import android.icu.text.CaseMap
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.health.SixNine
import com.example.nepalprojekt.ui.theme.health.ZeroSix
import org.w3c.dom.Text

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun HealthGeneral (
    navController: NavController,
    titles: List<String> = List(1) {"$it"} //listOf("0-6", "6-9", "9-12")
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            InfoBoxesExpandable(title = "Pregnant", description = "description")
            InfoBoxesExpandable(title = "General", description = "description")


        }
    }
}

/**
 * Each box containing health information
 * In a Card shape, making rounded edges possible
 */
@Composable
fun InfoBoxesExpandable (
    title: String,
    description: String
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        InfoElementExpandable(title, description)
    }
}

/**
 * Modifications and animation for each health info element
 */

@Composable
fun InfoElementExpandable(

    title: String,
    description: String
) {
    var expanded by remember { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded

/*val extraPadding by animateDpAsState( //animates extraPadding, also animateDpAsState is interuptible
    if (expanded.value) 48.dp else 0.dp,
    animationSpec = spring(
        dampingRatio = Spring.DampingRatioMediumBouncy,
        stiffness = Spring.StiffnessLow
    )
)*/


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

            //description = if (expanded) {function} else {}
        }

/*OutlinedButton(
    onClick = { expanded.value = !expanded.value }
) {
    Text(if (expanded.value) "Show less" else "Show more")
}*/

// -----------IconButton, instead of OutlinedButton
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,

                /*contentDescription = if (expanded) {
                    Text(description) //Place of description of each element
                }
                 */

                contentDescription = (if (expanded) { //String resources needed to make Icon work. Isn't shown in app.
                    stringResource(R.string.show_less)
                } else {
                    stringResource(R.string.show_more)
                })
            )


        }
    }
}