package com.example.nepalprojekt.ui.theme.recipes

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.*

/** Recipes for adults. Contains an introduction, pictures of food groups in expandable boxes and then two recipes */
@Composable
fun RecipesAdult (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            TopBar(topBarTitle = "Recipes") { navController.navigate(Screen.MainMenu.route) }

            Box() {Image(painterResource(id = R.drawable.hp4_balanceddiet_withmeat), contentDescription = null)}
            ResAdultIntro() // Intro
            InfoBoxesExpandable( // Strengthening food
                title = stringResource(id = R.string.strengthening_food), null,
                description = null,
                image2 = painterResource(id = R.drawable.ra1_strength_food), null, null, null, null,null, null,null, null,null
            )
            InfoBoxesExpandable( // Protective food
                title = stringResource(id = R.string.protective_food), null,
                description = null,
                image2 = painterResource(id = R.drawable.ra2_protective_food), null, null, null, null,null, null,null, null,null
            )
            InfoBoxesExpandable( // Energy food
                title = stringResource(id = R.string.energy_food), null,
                description = null,
                image2 = painterResource(id = R.drawable.ra3_food_group_2_energy), null, null, null, null,null, null,null, null,null
            )
            RecipeSuggestionsIntro() //Overskrift til opskrifter
            WaterCressCurry()
        }
    }
}

@Composable
fun ResAdultIntro () {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Box(modifier = Modifier.padding(12.dp)
        ) {
            Text(stringResource(id = R.string.recipe_adult_general_information))
        }
    }
}

@Composable
fun RecipeSuggestionsIntro () {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Box(modifier = Modifier.padding(12.dp)
        ) {
            Text(stringResource(id = R.string.the_following_are_suggestions))
        }
    }
}

@Composable
fun WaterCressCurry () {
    var expanded by remember { mutableStateOf(false) }

    Card(
        backgroundColor = Color.White,
        border = BorderStroke(width = 4.dp, color = MaterialTheme.colors.primary),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(1f)
        ) {
            Text(modifier = Modifier.align(Alignment.Center),
                text = stringResource(id = R.string.recipe_water_cress_curry)) // Title
        }
        Row(modifier = Modifier
            .padding(12.dp)
            .animateContentSize( //animateContentSize automates the process of creating the animation (replaces extraPadding)
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
        ) {
            if (expanded) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .padding(12.dp)
                            .animateContentSize(
                                animationSpec = spring(
                                    dampingRatio = Spring.DampingRatioMediumBouncy,
                                    stiffness = Spring.StiffnessLow
                                )
                            )
                    ) {
                        Column( // Ingredients
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
                            modifier = Modifier
                                .weight(1f)
                                .padding(12.dp)
                        ) {
                            Text(stringResource(id = R.string.ingredients))
                            Text(stringResource(id = R.string.recipe_water_cress_curry_ingredients))
                        }
                        Column( // Quantity
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
                            modifier = Modifier
                                .weight(1f)
                                .padding(12.dp)
                        ) {
                            Text(stringResource(id = R.string.quantity))
                            Text(stringResource(id = R.string.recipe_water_cress_curry_ingredients_quantity))
                        }
                    }
                    Box(modifier = Modifier.padding(12.dp)) {
                        Text(
                            text = stringResource(id = R.string.procedure),
                            fontSize = fontSizeTitles
                        )
                    }
                    Box(modifier = Modifier.padding(12.dp)) {
                        Text(text = stringResource(id = R.string.recipe_water_cress_curry_procedure))
                    }

                    IconButton(onClick = { expanded = !expanded }) {
                        Icon(
                            imageVector = if (!expanded) Icons.Filled.ExpandMore else Icons.Filled.ExpandLess,
                            contentDescription = null
                        )
                    }
                }
            }
            IconButton(onClick = { expanded = !expanded }) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = null
                )
            }
        }
    }
}