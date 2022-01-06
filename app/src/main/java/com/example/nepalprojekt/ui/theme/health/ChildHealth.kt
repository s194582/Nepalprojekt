package com.example.nepalprojekt.ui.theme.health

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nepalprojekt.R

@Preview
@Composable
fun ZeroSix () {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column (modifier = Modifier
        //.weight(1f)
        .padding(12.dp)
    ) {
            // The child should be examined at the health institution on the third day within 24 hours of birth and at 4 months.
        Text(stringResource(id = R.string.zero_six_the_child_should_be_examined))
            // OBS! Blue on the spreadsheet
            // The first yellow milk of the mother should be fed as soon as possible (within 1 hour) after the birth of the newborn baby.
        Text(stringResource(id = R.string.zero_six_the_first_yellow_milk))
            // From birth to 6 months the baby does not need to be fed water as it is exclusively breast milk.
        Text(stringResource(id = R.string.zero_six_from_birth_to_6_months))
            // Starting breastfeeding as soon as you are born helps to keep the milk constant.
        Text(stringResource(id = R.string.zero_six_starting_breastfeeding_as_soon))
            // Newborns should be breastfed at least 10 times a day, day and night.
        Text(stringResource(id = R.string.zero_six_newborns_should_be_breastfeed))
            // Feed from one breast only after feeding in another way.
        Text(stringResource(id = R.string.zero_six_feed_from_one_breast_only))
            // OBS! Might get deleted
            // Feeding the child 6 months of age and additional vitamin A capsules and parasite medicine every 6-6 months.
        Text(stringResource(id = R.string.zero_six_feeding_the_child_6_months))
    }

    }

}