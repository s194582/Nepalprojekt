package com.example.nepalprojekt.ui.theme.health

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nepalprojekt.R
import com.example.nepalprojekt.ui.theme.BackButton
import com.example.nepalprojekt.ui.theme.navigation.Screen
import com.example.nepalprojekt.ui.theme.spaceBetweenChildren

//@Preview
@Composable
fun ZeroSix (
    navController: NavController
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            //.verticalScroll(enabled = true)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .padding(12.dp) //.weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            // Picture of healthpost
            Image(painter = painterResource(id = R.drawable.hc1_go_to_healthpost),
                contentDescription = "go_to_healthpost",
                //contentScale = ContentScale.Crop
            )
            // The child should be examined at the health institution on the third day within 24 hours of birth and at 4 months.
            Text(stringResource(id = R.string.zero_six_the_child_should_be_examined))

            Image(painter = painterResource(id = R.drawable.hc3_0_6month),
                contentDescription = "0-6 month"
            )
            // From birth to 6 months the baby does not need to be fed water as it is exclusively breast milk.
            Text(stringResource(id = R.string.zero_six_from_birth_to_6_months))

            Image(painter = painterResource(id = R.drawable.hc4_breastfeed6months_shortversion),
                contentDescription = "breastfeed6months"
            )
            // Starting breastfeeding as soon as you are born helps to keep the milk constant.
            Text(stringResource(id = R.string.zero_six_starting_breastfeeding_as_soon))

            // Newborns should be breastfed at least 10 times a day, day and night.
            Text(stringResource(id = R.string.zero_six_newborns_should_be_breastfeed))

            // Feed from one breast only after feeding in another way.
            Text(stringResource(id = R.string.zero_six_feed_from_one_breast_only))

            // Feeding the child 6 months of age and additional vitamin A capsules and parasite medicine every 6-6 months.
            Text(stringResource(id = R.string.zero_six_feeding_the_child_6_months))

            BackButton() {
                navController.navigate(Screen.HealthInfoChild.route)
            }
        }
    }
}

//@Preview
@Composable
fun SixNine (
    navController: NavController
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Picture of health post, same as 0-6
            Image(painter = painterResource(id = R.drawable.hc1_go_to_healthpost),
                contentDescription = "healthpost")
            // After the child reaches 6 months and 9 months, go to the health institution for examination.
            Text(stringResource(id = R.string.six_nine_after_the_child_reaches))

            Image(painter = painterResource(id = R.drawable.hc21_6_9mdr_breastfeedingandfeeding_logo),
                contentDescription = "breastfeeding and feeding")
            // After the completion of 6 months (180 days), breast milk should be fed with different foods till the completion of two years.
            Text(stringResource(id = R.string.six_nine_after_the_completion))

            Image(painter = painterResource(id = R.drawable.hc22_6_9mdr_feedingandfood),
                contentDescription = "feeding and food")
            // When starting different feeding, feed 2 to 3 tablespoons at a time and then increase to 1 cup of tea (125 ml) at a time.
            Text(stringResource(id = R.string.six_nine_when_starting_different))

            Image(painter = painterResource(id = R.drawable.hc23_jauloandlitto),
                contentDescription = "jaulo and litto")
            // Different foods should be prepared daily by mixing at least 4 groups of food (grains, nuts, animal foods, fruits and vegetables).
            Text(stringResource(id = R.string.six_nine_different_foods_should))

            Image(painter = painterResource(id = R.drawable.hc24_boiled_water),
                contentDescription = "boiling water")
            // Always use clean or boiled water.
            Text(stringResource(id = R.string.six_nine_always_use_boiled))

            Image(painter = painterResource(id = R.drawable.hc241_handwashing),
                contentDescription = "wash hands")
            // Wash hands thoroughly with soap and water before cooking and after feeding.
            Text(stringResource(id = R.string.six_nine_wash_hands_thoroughly))

            Image(painter = painterResource(id = R.drawable.hc25_two_children_salt),
                contentDescription = "salt logo")
            // Only salt with two children logo should be used when preparing food.
            Text(stringResource(id = R.string.six_nine_only_salt))

            BackButton() {
                navController.navigate(Screen.HealthInfoChild.route)
            }
        }
    }
}

@Composable
fun NineTwelve (
    navController: NavController
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Picture of three meals a day
            Image(painter = painterResource(id = R.drawable.hc41_9_12months_withfoods),
                contentDescription = "three meals a day")
            //In addition to breastfeeding, feed the baby 3 times a day (2 meals and 1 oatmeal), one glass of tea (125 ml) different food and 1 meal.
            //Fruits can be included in the lunch.
            Text(stringResource(id = R.string.nine_twelve_in_addition_to))
            // Picture of clean water
            Image(painter = painterResource(id = R.drawable.hc42_clean_water_big),
                contentDescription = "clean water")
            //Clean and safe water should be used.
            Text(stringResource(id = R.string.nine_twelve_clean_and_safe))
            // Picture of handwashing
            Image(painter = painterResource(id = R.drawable.hc241_handwashing),
                contentDescription = "hand washing")
            //Special attention should be paid to hygiene (floors, utensils, hands around work).
            Text(stringResource(id = R.string.nine_twelve_special_attention))
            // Picture of junk with a cross over
            Image(painter = painterResource(id = R.drawable.hc44_no_snacks_poster_2a),
                contentDescription = "NO snacks poster")
            //Discourage eating less nutritious food available in the market.
            //It will make your child less healthy.
            Text(stringResource(id = R.string.nine_twelve_discourage_eating))

            BackButton() {
                navController.navigate(Screen.HealthInfoChild.route)
            }
        }
    }
}

@Composable
fun TwelveTwentyfour (
    navController: NavController
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // In addition to breastfeeding, 3 times a day (3 meals only), two teaspoons of glass (250 ml) of supplementary food and 2 meals should be fed.
            Text(stringResource(id = R.string.twelve_twentyfour_in_addition))
            Image(painter = painterResource(id = R.drawable.hc51_12_24months_withvegetables),
                contentDescription = "three meal a day with vegetables")
            // Each meal should include the three food groups.
            Text(stringResource(id = R.string.twelve_twentyfour_each_meal))
            // Snacks should include seasonal fruits and eggs if possible.
            Text(stringResource(id = R.string.twelve_twentyfour_snacks_should))
            // Eating fresh home-cooked food (meat, eggs and fish) should be encouraged.
            Text(stringResource(id = R.string.twelve_twentyfour_eating_fresh))

            BackButton() {
                navController.navigate(Screen.HealthInfoChild.route)
            }
        }
    }
}