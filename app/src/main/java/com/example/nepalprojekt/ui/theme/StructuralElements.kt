package com.example.nepalprojekt.ui.theme

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

/** spaceBetweenChildren is used in
 * ChildHealth.kt for vertical spacing
 * GeneralHealth.kt */
val spaceBetweenChildren = 12.dp

/** BackButton is used in
 * ChildHealth.kt to navigate back to Child Health Info page
 * GeneralHealth.kt */
@Composable
fun BackButton (
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Filled.ExpandLess,
            contentDescription = ""
        )
    }
}

/** Composition inspired by https://www.jetpackcompose.net/scaffold topAppBar */
@Composable
fun TopBar () {

}