package com.example.nepalprojekt.ui.theme.health

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nepalprojekt.R

val spaceBetweenChildren = 12.dp

//@Preview
@Composable
fun ZeroSix () {
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

            /* TODO: Revisit, as the following might get left out */
            // Feeding the child 6 months of age and additional vitamin A capsules and parasite medicine every 6-6 months.
            Text(stringResource(id = R.string.zero_six_feeding_the_child_6_months))
        }
    }
}

@Preview
@Composable
fun SixNine () {
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
            /*TODO
            *  Consider adding link to recipes*/

            Image(painter = painterResource(id = R.drawable.hc24_boiled_water),
                contentDescription = "boiling water")
            // Always use clean or boiled water.
            Text(stringResource(id = R.string.six_nine_always_use_boiled))

            Image(painter = painterResource(id = R.drawable.hc241_handwashing),
                contentDescription = "wash hands")
            // Wash hands thoroughly with soap and water before cooking and after feeding.
            Text(stringResource(id = R.string.six_nine_wash_hands_thoroughly))

            Image(painter = painterResource(id = R.drawable.hc25_two_children_logo_salt),
                contentDescription = "salt logo")
            // Only salt with two children logo should be used when preparing food.
            Text(stringResource(id = R.string.six_nine_only_salt))
        }
    }
}

/* TODO: Revisit for changes in translations */
@Composable
fun NineTwelve () {
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
        ) {
            /* Picture of
            Image(painter = painterResource(id = R.drawable.),
                contentDescription = ""
            )
            Text(stringResource(id = R.string.))

             */
        }
    }
}

/* TODO: Revisit for changes in translations */
@Composable
fun TwelveTwentyfour () {
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
        ) {
            /* Picture of
            Image(painter = painterResource(id = R.drawable.),
                contentDescription = ""
            )
            Text(stringResource(id = R.string.))

             */
        }
    }
}