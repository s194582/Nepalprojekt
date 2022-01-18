package com.example.nepalprojekt.ui.theme

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** spaceBetweenChildren is used in
 * ChildHealth.kt for vertical spacing
 * GeneralHealth.kt */
val spaceBetweenChildren = 12.dp

val fontSizeTitles = 16.sp
//val cardBackgroundColor = MaterialTheme.colors.primary

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
fun TopBar (
    topBarTitle: String,
    onClick: () -> Unit
) {
    Row() {
        IconButton(onClick = onClick) {
            Icon(Icons.Filled.ArrowBack, "backIcon", tint = Color.White)
        }
        Text(text = topBarTitle,
            fontSize = 28.sp,
            color = Color.White)
    }

}
/*val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold (
        topBar = { TopAppBar(
            title = {  },
            backgroundColor = MaterialTheme.colors.primary) },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { FloatingActionButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "returnIcon")
        } }
    )

     */