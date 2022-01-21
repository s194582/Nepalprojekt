package com.example.nepalprojekt.ui.theme

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
import com.example.nepalprojekt.ui.theme.navigation.Screen

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

            // Growth monitoring
            PictureBox(title = stringResource(id = R.string.growth_monitoring),
                image = painterResource(id = R.drawable.growth_monitoring),
                description = stringResource(id = R.string.growth_monitoring_description))
        }
    }
}