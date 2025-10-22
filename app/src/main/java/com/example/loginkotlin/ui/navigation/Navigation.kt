package com.example.loginkotlin.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginkotlin.ui.login.LogIn
import com.example.loginkotlin.ui.recovery.Recovery
import com.example.loginkotlin.ui.register.Register

sealed class Navigation(val route: String) {
    object Login: Navigation("login")
    object Register: Navigation("register")
    object Recovery: Navigation("recovery")
}

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Navigation.Login.route
    ) {
        composable(route = Navigation.Login.route){
            LogIn(navController)
        }
        composable(route = Navigation.Register.route){
            Register(navController)
        }
        composable(route = Navigation.Recovery.route){
            Recovery(navController)
        }
    }
}