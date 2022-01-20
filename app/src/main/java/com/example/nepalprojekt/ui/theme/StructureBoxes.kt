package com.example.nepalprojekt.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                Text(title,
                    fontSize = fontSizeTitles,
                    fontWeight = FontWeight.SemiBold
                )
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

/**
 * Each box containing information
 * In a Card shape, making rounded edges possible
 */
@Composable
fun InfoBoxesExpandable (
    title: String,
    image: Painter?,
    description: String?,
    image2: Painter?,
    desc2: String?,
    image3: Painter?,
    desc3: String?,
    image4: Painter?,
    desc4: String?,
    image5: Painter?,
    desc5: String?,
    image6: Painter?,
    desc6: String?,
    image7: Painter?,
    desc7: String?
) {
    Card(
        backgroundColor = Color.White,
        border = BorderStroke(width = 4.dp, color = MaterialTheme.colors.primary),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        InfoElementExpandable(title, image, description, image2, desc2, image3, desc3, image4, desc4, image5, desc5, image6, desc6, image7, desc7)
    }
}

/**
 * Modifications and animation for each info element
 * Possible to expand for more info
 */
@Composable
fun InfoElementExpandable(
    title: String,
    image: Painter?,
    description: String?,
    image2: Painter?,
    desc2: String?,
    image3: Painter?,
    desc3: String?,
    image4: Painter?,
    desc4: String?,
    image5: Painter?,
    desc5: String?,
    image6: Painter?,
    desc6: String?,
    image7: Painter?,
    desc7: String?
) {
    var expanded by remember { mutableStateOf(false) } //rememberSaveable keeps expanded elements expanded

    Row (modifier = Modifier
        .padding(12.dp)
        .animateContentSize( //animateContentSize automates the process of creating the animation (replaces extraPadding)
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(spaceBetweenChildren),
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(title, //Place of title of each element
                fontSize = fontSizeTitles,
                fontWeight = FontWeight.SemiBold
            )

            if (expanded) {
                if (image != null) {
                    Image(painter = image, contentDescription = null)
                }
                if (description != null) {
                    Text(description)
                }
                if (image2 != null) {
                    Image(painter = image2, contentDescription = null)
                }
                if (desc2 != null) {
                    Text(desc2)
                }
                if (image3 != null) {
                    Image(painter = image3, contentDescription = null)
                }
                if (desc3 != null) {
                    Text(desc3)
                }
                if (image4 != null) {
                    Image(painter = image4, contentDescription = null)
                }
                if (desc4 != null) {
                    Text(desc4)
                }
                if (image5 != null) {
                    Image(painter = image5, contentDescription = null)
                }
                if (desc5 != null) {
                    Text(desc5)
                }
                if (image6 != null) {
                    Image(painter = image6, contentDescription = null)
                }
                if (desc6 != null) {
                    Text(desc6)
                }
                if (image7 != null) {
                    Image(painter = image7, contentDescription = null)
                }
                if (desc7 != null) {
                    Text(desc7)
                }
            }
        }

        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,

                contentDescription = null
            )
        }
    }
}