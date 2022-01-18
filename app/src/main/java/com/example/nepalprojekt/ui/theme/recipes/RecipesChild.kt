package com.example.nepalprojekt.ui.theme.recipes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.InfoBoxesExpandable
import com.example.nepalprojekt.ui.theme.Screen
import com.example.nepalprojekt.ui.theme.TopBar

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun RecipesChild (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            TopBar(topBarTitle = stringResource(id = R.string.recipes_for_children)) { navController.navigate(
                Screen.MainMenu.route) }

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