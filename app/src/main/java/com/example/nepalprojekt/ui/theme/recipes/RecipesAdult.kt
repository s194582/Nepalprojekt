package com.example.nepalprojekt.ui.theme.recipes

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.InfoBoxes
import com.example.nepalprojekt.ui.theme.InfoBoxesExpandable

/** Recipes for adults. Contains an introduction, pictures of food groups in expandable boxes and then two recipes */
@Composable
fun RecipesAdult (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
// INTRO

            InfoBoxesExpandable( // Strengthening food
                title = "Strengthening food", null,
                description = "",
                image2 = null, null, null, null, null,null, null,null, null,null
            )
            InfoBoxesExpandable( // Protective food
                title = "Protective food", null,
                description = "",
                image2 = null, null, null, null, null,null, null,null, null,null
            )
            InfoBoxesExpandable( // Energy food
                title = "Energy food", null,
                description = "",
                image2 = null, null, null, null, null,null, null,null, null,null
            )
            //OVERSKRIFT TIL OPSKRIFTER
            InfoBoxes(title = "", description = "", image = null) {
                //Route for recipe Water cress curry
            }
            InfoBoxes(title = "", description = "", image = null) {
                //Route for recipe Cauliflower curry
            }
        }
    }
}

@Composable
fun ResAdultIntro () {

}