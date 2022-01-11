package com.example.nepalprojekt.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nepalprojekt.R

@Preview
@Composable
fun ThirdRecipeChild () {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            modifier = Modifier
                //.weight(1f)
                .padding(12.dp)
        ) {
            // Picture of healthpost
            Image(
                painter = painterResource(id = R.drawable.meme),
                contentDescription = stringResource(id = R.string.TestTekst3),
                //contentScale = ContentScale.Crop
            )
            // The child should be examined at the health institution on the third day within 24 hours of birth and at 4 months.
            Text(stringResource(id = R.string.TestTekst3))
        }
    }
}