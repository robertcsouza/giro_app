package com.rcsouza.giroapp.feature.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rcsouza.giroapp.feature.splash.SplashScreen


@Composable
fun GiroNavGraph(startDestination: Screens = Screens.SplashScreen) {

    val navController = rememberNavController()

    NavHost(
        startDestination = startDestination,
        navController = navController
    ){

        composable<Screens.SplashScreen> {
            SplashScreen()
        }

    }
}