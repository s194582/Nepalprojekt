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

            // Sarbottam Pitho recipe
            InfoBoxesExpandable(title = stringResource(id = R.string.sarbottam_pitho),
                null,
                stringResource(id = R.string.how_to_prepare_sarbottam_pitho),
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

            // Jaulo recipe
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
                null,null,null)

            // Litto recipe
            InfoBoxesExpandable(title = stringResource(id = R.string.the_best_flour_litto),
                painterResource(id = R.drawable.litto),
                stringResource(id = R.string.litto_ingredients),
                painterResource(id = R.drawable.litto_kopi_af_sarbottam_pitho_nutritiousflower),
                null,null,
                stringResource(id = R.string.litto_directions),
                painterResource(id = R.drawable.litto_ghee_oil),
                stringResource(id = R.string.litto_note),
                null,null,null,null)

            // Pumpkin pudding recipe //TODO: check back for translation
            InfoBoxesExpandable(title = stringResource(id = R.string.pumpkin_pudding),
                null,
                stringResource(id = R.string.how_to_make_pumpkin_pudding),
                painterResource(id = R.drawable.pumpkin_pictures_of_ingredients),
                stringResource(id = R.string.materials_required),null,
                stringResource(id = R.string.pumpkin_pudding_ingredients),
                painterResource(id = R.drawable.pumpkin_overview_of_quantity_of_ingredients),
                stringResource(id = R.string.how_to_make),null,
                stringResource(id = R.string.pumpkin_pudding_directions),
                painterResource(id = R.drawable.pumpkin_readyinbowl),
                stringResource(id = R.string.pumpkin_pudding_note))
        }
    }
}