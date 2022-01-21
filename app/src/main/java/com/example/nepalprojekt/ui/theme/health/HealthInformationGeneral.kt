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
fun HealthGeneral (
    navController: NavController,
    titles: List<String> = List(1) {"$it"}
) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        items(items = titles) { title ->
            TopBar(topBarTitle = stringResource(id = R.string.health_information)) { navController.navigate(
                Screen.MainMenu.route) }

            PictureBox(title = null, image = painterResource(id = R.drawable.whentowashhands), description = null)

            // Pregnancy info box
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
                stringResource(id = R.string.pregnancy_get_enough_rest),
                null, null)

            // General information consists of vitamin information atm.
            InfoBoxesExpandable(title = stringResource(id = R.string.general_information),
                null,
                stringResource(id = R.string.vitamin_a_description),
                null,
                stringResource(id = R.string.iron_element_description),
                null, null, null, null, null, null, null, null, null, null)

            PictureBox(title = null, image = painterResource(id = R.drawable.whentogotohospital), description = null)
        }
    }
}