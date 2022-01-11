package com.example.nepalprojekt.ui.theme.recipes

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.InfoBoxesExpandable
import com.example.nepalprojekt.ui.theme.health.SixNine
import com.example.nepalprojekt.ui.theme.health.ZeroSix
import org.w3c.dom.Text

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun RecipesChild (
    navController: NavController,
    titles: List<String> = List(1) {"$it"} //listOf("0-6", "6-9", "9-12")
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            InfoBoxesExpandable(title = stringResource(id = R.string.nutritious_flour),
                null,
                stringResource(id = R.string.how_to_make_nutritious_flour),
                painterResource(id = R.drawable.nf_3_grainsfornutritiousflour),
                stringResource(id = R.string.nutritious_flour_recipe_first_four_paragraphs),
                painterResource(id = R.drawable.nf1_sortoutthegrains),
                stringResource(id = R.string.nutritious_flour_recipe_last_paragraph),
                painterResource(id = R.drawable.nf2_roastthegrains),
                null,
                painterResource(id = R.drawable.nf3_grindthegrains),
                null,
                painterResource(id = R.drawable.nf4_putflourincontainer),
                null)

            InfoBoxesExpandable(title = stringResource(id = R.string.jaulo),
                null,
                stringResource(id = R.string.jaulo_ingredients),
                painterResource(id = R.drawable.jaulo_rice),
                null,
                painterResource(id = R.drawable.jaulo_lentil),
                stringResource(id = R.string.jaulo_directions),
                painterResource(id = R.drawable.jaulo_spinach_saag),
                stringResource(id = R.string.jaulo_directions2),
                painterResource(id = R.drawable.jaulo),
                null,
                null,
                null)
        }
    }
}
/*
/**
 * Each box containing recipe information
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
 * Modifications and animation for each recipe element
 */
@Composable
fun InfoElementExpandable(
    title: String,
    description: String
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
                Text("bh")

            }
        }

        /** IconButton is represented as a small arrow pointing up or down */
        IconButton(onClick = { expanded = !expanded }) {
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

 */