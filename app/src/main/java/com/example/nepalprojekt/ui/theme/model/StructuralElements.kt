package com.example.nepalprojekt.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val Violet = Color(0xFFe1bee7)
val newViolet = Color(0xFFf4d4fa)
val seafoam = Color(0xffe0f2f1)
val purple = Color(0xff6633FF)

/** spaceBetweenChildren is used in
 * ChildHealthPages.kt for vertical spacing
 * GeneralHealth.kt */
val spaceBetweenChildren = 12.dp

val fontSizeTitles = 18.sp

/** BackButton is used in
 * ChildHealthPages.kt to navigate back to Child Health Info page
 * */
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
fun TopBar (
    topBarTitle: String,
    onClick: () -> Unit
) {
    Row() {
        IconButton(onClick = onClick) {
            Icon(Icons.Filled.ArrowBack, "backIcon", tint = MaterialTheme.colors.primary)
        }
        Text(text = topBarTitle,
            fontSize = 28.sp,
            color = MaterialTheme.colors.primary)
    }
}