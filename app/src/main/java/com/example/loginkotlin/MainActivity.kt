package com.example.loginkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.loginkotlin.ui.login.LogIn
import com.example.loginkotlin.ui.navigation.navigation
import com.example.loginkotlin.ui.recovery.Recovery
import com.example.loginkotlin.ui.register.Register
import com.example.loginkotlin.ui.theme.LoginKotlinTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginKotlinTheme {
                //LogIn()
                //Recovery()
                Register()
            }
        }
    }
}

