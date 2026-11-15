package com.rcsouza.giroapp.feature.nav

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rcsouza.giroapp.feature.login.LoginScreen
import com.rcsouza.giroapp.feature.register.RegisterScreen
import com.rcsouza.giroapp.feature.splash.SplashScreen


@Composable
fun GiroNavGraph(startDestination: Screens = Screens.SplashScreen) {

    val navController = rememberNavController()

    NavHost(
        startDestination = startDestination,
        navController = navController
    ){

        composable<Screens.SplashScreen> {
            SplashScreen(
                navigateToLogin = {
                    navController.navigate(route = Screens.LoginScreen){
                        popUpTo<Screens.SplashScreen> {
                            inclusive = true
                        }
                    }
                },
                navigateToRegister = {
                    navController.navigate(route = Screens.RegisterScreen){
                        popUpTo<Screens.SplashScreen>{
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable<Screens.LoginScreen> {
            LoginScreen(
                onBackClick =  {
                    navController.navigate(route = Screens.SplashScreen){
                        popUpTo<Screens.LoginScreen>{
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable<Screens.RegisterScreen> {
            RegisterScreen(
                onBackClick = {
                    navController.navigate(route = Screens.SplashScreen){
                        popUpTo<Screens.RegisterScreen>{
                            inclusive = true
                        }
                    }
                },
                onLoginClick = {
                    navController.navigate(route = Screens.LoginScreen){
                        popUpTo<Screens.RegisterScreen>{
                            inclusive = true
                        }
                    }
                }

            )
        }

    }
}