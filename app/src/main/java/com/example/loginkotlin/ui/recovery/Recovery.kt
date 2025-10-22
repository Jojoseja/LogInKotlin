package com.example.loginkotlin.ui.recovery

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.loginkotlin.ui.navigation.Navigation

@Composable
fun Recovery(navController: NavHostController) {
    var email by remember {mutableStateOf("") }
    Box(
        Modifier
            .fillMaxSize()
            .padding(10.dp), contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                , verticalArrangement = Arrangement.Center
        ) {

            // Caja "Recupera Tu Contraseña"
            Box (
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            )
            { Text(
                    text="Recupera Tu Contraseña",
                    color = Color.Blue,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                ) }
            // Caja Email
            Row (Modifier
                .fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    //label = {Text("Email")},
                    placeholder = {Text("Email")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .border(2.dp, Color.Gray, RectangleShape)
                )
            }
            // Enviar
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        navController.navigate(Navigation.Login.route)
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp)
                )
                {
                    Text(text = "Enviar")
                }
            }
        }
    }
}