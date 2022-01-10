package com.example.nepalprojekt.ui.theme.health

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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

@Preview
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

            /** TO DO
             * Revisit, as the following might get left out */
            // Feeding the child 6 months of age and additional vitamin A capsules and parasite medicine every 6-6 months.
            Text(stringResource(id = R.string.zero_six_feeding_the_child_6_months))
        }
    }
}

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
            // Picture of
            //Image(painter = painterResource(id = R.drawable.),
            //    contentDescription = ""
            //)
            //
            //Text(stringResource(id = R.string.))


        }
    }
}