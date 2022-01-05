package com.example.nepalprojekt.ui.theme

import android.icu.text.CaseMap
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.w3c.dom.Text

/**
 * Inspiration for expanding info boxes from
 * https://developer.android.com/codelabs/jetpack-compose-basics?hl=fr#0
 */
@Composable
fun HealthChild (
    navController: NavController,

) {


    Surface (
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            //horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement = Arrangement.SpaceEvenly
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            InfoElement(title = "Zero to Six months", description = ("Composem ipsum color sit lazy, " +
                    "padding theme elit, sed do bouncy. ").repeat(4))

            //Spacer(modifier = Modifier.height(10.dp))

            InfoElement(title = "Six to nine months", description = ("Composem ipsum color sit lazy, " +
                    "padding theme elit, sed do bouncy. ").repeat(4))
        }

    }


}

@Composable
fun InfoElement (
    title: String,
    description: String
    ) {
    var expanded = rememberSaveable { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded
    val extraPadding by animateDpAsState( //animates extraPadding, also animateDpAsState is interuptible
        if (expanded.value) 48.dp else 0.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )

    Row (modifier = Modifier.padding(12.dp)
            ) {
        Column (modifier = Modifier
            .weight(1f)
            .padding(//bottom = extraPadding.coerceAtLeast(0.dp)
            12.dp )
        ) {
            Text(title) //Place of title of each element
        }
        OutlinedButton(
            onClick = { expanded.value = !expanded.value }
        ) {
            Text(if (expanded.value) "Show less" else "Show more")
        }
        if (expanded.value) {
            Text(description) //Place of description of each element
        }
    }
}