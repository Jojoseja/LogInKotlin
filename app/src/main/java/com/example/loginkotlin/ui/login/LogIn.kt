package com.example.loginkotlin.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LogIn(){
    var email by remember {mutableStateOf("") }
    var passwd by remember {mutableStateOf("")}

    Box(
        Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {

            // Caja "Login"
            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(color = Color.White)
                    .padding(0.dp, 150.dp, 0.dp, 10.dp),
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text="Login",
                    color = Color.Blue,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            // Caja Te echamos de menos
            Box (Modifier
                .fillMaxWidth()
                //.background(color = Color.White)
                .padding(30.dp),
                contentAlignment = Alignment.Center
            ) {
                Text (
                    text = "¡Te echabamos de menos!",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }
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
            // Caja Password
            Row (Modifier
                .fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = passwd,
                    onValueChange = { passwd = it },
                    placeholder = {Text("Password")},
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .border(2.dp, Color.Gray, RectangleShape)

                )
            }
            // Caja Olvidaste tu contraseña
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "¿Olvidaste tu contraseña?",
                    color = Color.Blue,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            // Sign In
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        println("Hello")
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp)
                )
                {
                    Text(text = "Sign In")
                }
            }
            // Caja Crear una cuenta nueva
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, 15.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Crear una nueva cuenta",
                    color = Color.Gray,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, top = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "O continua con",
                    color = Color.Blue,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row (Modifier
                .fillMaxWidth()
                .padding(20.dp, 10.dp),
                horizontalArrangement = Arrangement.Center

            ) {
                //Google - Base
                Button(
                    modifier = Modifier.padding(horizontal = 5.dp),
                    onClick = { println("Google") },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Email,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp)
                    )
                }
                //Facebook
                Button(
                    modifier = Modifier.padding(horizontal = 5.dp),
                    onClick = { println("Facebook") },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.AccountBox,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp)
                    )
                }
                //Mac
                Button(
                    modifier = Modifier.padding(horizontal = 5.dp),
                    onClick = { println("Mac") },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.LightGray
                    ),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = "Google",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }

        }

    }
}