package com.example.nepalprojekt.ui.theme

//Forsøges omskrives til en sidde med knapper.

import android.icu.text.CaseMap
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nepalprojekt.ButtonElement
import org.w3c.dom.Text

@Composable
fun RecipeChild( // Box containing two buttons for health info
        navController: NavController,
        title: String,
        subject1: String,
        subject2: String
) {
    Card( // for rounded shape
            shape = RoundedCornerShape(10.dp), //rounded corners of outer box
            modifier = Modifier
                    .padding(10.dp), //around outer box
            elevation = 20.dp //still don't know what it does
    ) {
        Box (
                modifier = Modifier
                        .background(Color.Green)
                        .padding(10.dp) //between inner and outer box
        ){
            Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly) {
                Text(title,
                        style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center)//.offset(40.dp, 40.dp))
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                        modifier = Modifier
                                .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                ) {
                    ButtonElement(
                            subject = subject1
                    ) { navController.navigate(Screen.RecipeAdultScreen.route) } //<-route for onClick for button
                    ButtonElement(
                            subject = subject2
                    ) { navController.navigate(Screen.RecipeChildren.route) }
                    //{ navController.navigate(Screen.RecipeChildren.route) }
                }
            }
        }
    }
}