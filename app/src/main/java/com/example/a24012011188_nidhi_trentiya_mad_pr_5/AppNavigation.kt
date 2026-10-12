package com.example.a24012011188_nidhi_trentiya_mad_pr_5

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a24012011188_nidhi_trentiya_mad_pr_5.LoginPage
import com.example.a24012011188_nidhi_trentiya_mad_pr_5.RegisterPage

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(navController = navController)
        }
        composable("register") {
            RegisterPage(navController = navController)
        }
    }
}