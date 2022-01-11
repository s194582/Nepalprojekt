package com.example.nepalprojekt.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun HealthGeneral (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->

            InfoBoxesExpandable(title = stringResource(id = R.string.pregnancy), // Pregnancy
                painterResource(id = R.drawable.hp1_gravid_lyttermave),
                null,
                painterResource(id = R.drawable.hp2_gravid_vaccination),
                stringResource(id = R.string.pregnancy_regular_health_check_ups),
                painterResource(id = R.drawable.hp3_gravid_orm),
                stringResource(id = R.string.pregnancy_after_3_months),
                painterResource(id = R.drawable.hp4_balanceddiet_withmeat),
                stringResource(id = R.string.pregnancy_eat_at_least),
                null, // TODO: revisit to see if drawing has been made
                stringResource(id = R.string.pregnancy_from_the_first),
                null, // TODO: revisit to see if drawing has been made
                stringResource(id = R.string.pregnancy_get_enough_rest))

            InfoBoxesExpandable(title = stringResource(id = R.string.general_information),
                null,
                description = "General",
                null,
                stringResource(id = R.string.test),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null)
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
    image: Painter?,
    description: String?,
    image2: Painter?,
    desc2: String?,
    image3: Painter?,
    desc3: String?,
    image4: Painter?,
    desc4: String?,
    image5: Painter?,
    desc5: String?,
    image6: Painter?,
    desc6: String?
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        InfoElementExpandable(title, image, description, image2, desc2, image3, desc3, image4, desc4, image5, desc5, image6, desc6)
    }
}

/**
 * Modifications and animation for each health info element
 */

@Composable
fun InfoElementExpandable(
    title: String,
    image: Painter?,
    description: String?,
    image2: Painter?,
    desc2: String?,
    image3: Painter?,
    desc3: String?,
    image4: Painter?,
    desc4: String?,
    image5: Painter?,
    desc5: String?,
    image6: Painter?,
    desc6: String?
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
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(title) //Place of title of each element

            if (expanded) {
                if (image != null) {
                    Image(painter = image, contentDescription = null)
                }
                if (description != null) {
                    Text(description)
                }
                if (image2 != null) {
                    Image(painter = image2, contentDescription = null)
                }
                if (desc2 != null) {
                    Text(desc2)
                }
                if (image3 != null) {
                    Image(painter = image3, contentDescription = null)
                }
                if (desc3 != null) {
                    Text(desc3)
                }
                if (image4 != null) {
                    Image(painter = image4, contentDescription = null)
                }
                if (desc4 != null) {
                    Text(desc4)
                }
                if (image5 != null) {
                    Image(painter = image5, contentDescription = null)
                }
                if (desc5 != null) {
                    Text(desc5)
                }
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