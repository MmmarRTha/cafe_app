package com.marthanieto.cafeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marthanieto.cafeapp.ui.screens.SplashScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination="splash"){
        composable("splash"){
            SplashScreen(navController)
        }
    }
}