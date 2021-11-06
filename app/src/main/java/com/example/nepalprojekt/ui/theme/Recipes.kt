package com.example.nepalprojekt.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Recipes() {
    LazyColumn { //only loads items if scrolled by
        itemsIndexed(
            listOf(
                "Recipe 1",
                "Recipe 2",
                "Recipe 3",
                "Recipe 4",
                "Recipe 5",
                "Recipe 6",
                "Recipe 7",
                "Recipe 8",
                "Recipe 9",
                "Recipe 10",
                "Recipe 11",
                "Recipe 12",
                "Recipe 13",
                "Recipe 14"
            )
        ) { index, string ->
            Text(
                text = string,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
}
