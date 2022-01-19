package com.example.nepalprojekt.ui.theme

import android.icu.text.CaseMap
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
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
fun HealthChild (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            TopBar(topBarTitle = stringResource(id = R.string.health_information)) {
                navController.navigate(
                    Screen.MainMenu.route
                )
            }

            // 0-6 months
            InfoBoxesExpandable(
                title = "० - ६ महिना",
                image = painterResource(id = R.drawable.hc1_go_to_healthpost),
                description = stringResource(id = R.string.zero_six_the_child_should_be_examined),// The child should be examined at the health institution on the third day within 24 hours of birth and at 4 months.
                image2 = painterResource(id = R.drawable.hc3_0_6month),
                desc2 = stringResource(id = R.string.zero_six_from_birth_to_6_months),// From birth to 6 months the baby does not need to be fed water as it is exclusively breast milk.
                image3 = painterResource(id = R.drawable.hc4_breastfeed6months_shortversion),
                desc3 = stringResource(id = R.string.zero_six_starting_breastfeeding_as_soon),// Starting breastfeeding as soon as you are born helps to keep the milk constant.
                image4 = null,
                desc4 = stringResource(id = R.string.zero_six_newborns_should_be_breastfeed),// Newborns should be breastfed at least 10 times a day, day and night.
                image5 = null,
                desc5 = stringResource(id = R.string.zero_six_feed_from_one_breast_only),// Feed from one breast only after feeding in another way.
                image6 = null,
                desc6 = stringResource(id = R.string.zero_six_feeding_the_child_6_months),// Feeding the child 6 months of age and additional vitamin A capsules and parasite medicine every 6-6 months.
                null, null
            )

            // 6-9 months
            InfoBoxesExpandable(
                title = "६ - ९ महिना",
                image = painterResource(id = R.drawable.hc1_go_to_healthpost),
                description = stringResource(id = R.string.six_nine_after_the_child_reaches),// After the child reaches 6 months and 9 months, go to the health institution for examination.
                image2 = painterResource(id = R.drawable.hc21_6_9mdr_breastfeedingandfeeding_logo),
                desc2 = stringResource(id = R.string.six_nine_after_the_completion),// After the completion of 6 months (180 days), breast milk should be fed with different foods till the completion of two years.
                image3 = painterResource(id = R.drawable.hc22_6_9mdr_feedingandfood),
                desc3 = stringResource(id = R.string.six_nine_when_starting_different),// When starting different feeding, feed 2 to 3 tablespoons at a time and then increase to 1 cup of tea (125 ml) at a time.
                image4 = painterResource(id = R.drawable.hc23_jauloandlitto),
                desc4 = stringResource(id = R.string.six_nine_different_foods_should),// Different foods should be prepared daily by mixing at least 4 groups of food (grains, nuts, animal foods, fruits and vegetables).
                image5 = painterResource(id = R.drawable.hc24_boiled_water),
                desc5 = stringResource(id = R.string.six_nine_always_use_boiled),// Always use clean or boiled water.
                image6 = painterResource(id = R.drawable.hc241_handwashing),
                desc6 = stringResource(id = R.string.six_nine_wash_hands_thoroughly),// Wash hands thoroughly with soap and water before cooking and after feeding.
                image7 = painterResource(id = R.drawable.hc25_two_children_salt),
                desc7 = stringResource(id = R.string.six_nine_only_salt)// Only salt with two children logo should be used when preparing food.
            )

            // 9-12 months
            InfoBoxesExpandable(
                title = "९ - १२ महिना",
                image = painterResource(id = R.drawable.hc41_9_12months_withfoods),
                description = stringResource(id = R.string.nine_twelve_in_addition_to),//In addition to breastfeeding, feed the baby 3 times a day (2 meals and 1 oatmeal), one glass of tea (125 ml) different food and 1 meal. Fruits can be included in the lunch.
                image2 = painterResource(id = R.drawable.hc42_clean_water_big),
                desc2 = stringResource(id = R.string.nine_twelve_clean_and_safe),//Clean and safe water should be used.
                image3 = painterResource(id = R.drawable.hc241_handwashing),
                desc3 = stringResource(id = R.string.nine_twelve_special_attention),//Special attention should be paid to hygiene (floors, utensils, hands around work).
                image4 = painterResource(id = R.drawable.hc44_no_snacks_poster_2a),
                desc4 = stringResource(id = R.string.nine_twelve_discourage_eating),//Discourage eating less nutritious food available in the market. It will make your child less healthy.
                null, null, null, null, null, null
            )
            // 12-24 months
            InfoBoxesExpandable(
                title = "१२ - २४ महिना",
                image = null,
                description = stringResource(id = R.string.twelve_twentyfour_in_addition),// In addition to breastfeeding, 3 times a day (3 meals only), two teaspoons of glass (250 ml) of supplementary food and 2 meals should be fed.
                image2 = painterResource(id = R.drawable.hc51_12_24months_withvegetables),
                desc2 = stringResource(id = R.string.twelve_twentyfour_each_meal),// Each meal should include the three food groups.
                image3 = null,
                desc3 = stringResource(id = R.string.twelve_twentyfour_snacks_should),// Snacks should include seasonal fruits and eggs if possible.
                image4 = null,
                desc4 = stringResource(id = R.string.twelve_twentyfour_eating_fresh),// Eating fresh home-cooked food (meat, eggs and fish) should be encouraged.
                null, null, null, null, null, null
            )

            /*InfoBoxes(title = "० - ६ महिना", description = "description1", image = null) {
            navController.navigate(Screen.ZeroSix.route)
        } // 0-6 months
        InfoBoxes(title = "६ - ९ महिना", description = "description2", image = null) {
            navController.navigate(Screen.SixNine.route)
        } // 6-9 months
        InfoBoxes(title = "९ - १२ महिना", description = "description3", image = null) {
            navController.navigate(Screen.NineTwelve.route)
        } // 9-12 months
        InfoBoxes(title = "१२ - २४ महिना", description = "description4", image = null) {
            navController.navigate(Screen.TwelveTwentyFour.route)
        } // 12-24 months
         */
        }
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
    image: Painter?, // Possibility of an image
    onClick: () -> Unit
) {
    Card(
        backgroundColor = Color.White,
        border = BorderStroke(width = 4.dp, color = MaterialTheme.colors.primary),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        InfoElement(title, description, image, onClick)
    }
}

/**
 * Modifications and animation for each health info element
 */
@Composable
fun InfoElement(
    title: String,
    description: String,
    image: Painter?,
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
                if (image != null) {
                    Image(painter = image, contentDescription = null)
                }
            }

            IconButton(onClick = onClick) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,

                    contentDescription = null
                )
            }


        }

        /*OutlinedButton(
            onClick = { expanded.value = !expanded.value }
        ) {
            Text(if (expanded.value) "Show less" else "Show more")
        }*/

        // -----------IconButton, instead of OutlinedButton

    }
}

/*@Composable
fun InfoElement(
    navController: NavController,
    title: String,
    description: String
) {
    var expanded by remember { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded
*/
    /*val extraPadding by animateDpAsState( //animates extraPadding, also animateDpAsState is interuptible
        if (expanded.value) 48.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )
     */

/*    Row (modifier = Modifier
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
*/
        /*OutlinedButton(
            onClick = { expanded.value = !expanded.value }
        ) {
            Text(if (expanded.value) "Show less" else "Show more")
        }*/

    // -----------IconButton, instead of OutlinedButton
/*        IconButton(onClick = { expanded = !expanded }) {
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

*/