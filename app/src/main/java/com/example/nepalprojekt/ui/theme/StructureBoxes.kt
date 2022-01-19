package com.example.nepalprojekt.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun PictureBox (
    title: String?,
    image: Painter?,
    description: String?
) {
    Card(
        backgroundColor = Color.White,
        border = BorderStroke(width = 4.dp, color = MaterialTheme.colors.primary),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            if (title != null) {
                Text(title)
            }
            if (image != null) {
                Image(painter = image, contentDescription = null)
            }
            if (description != null) {
                Text(description)
            }
        }
    }
}