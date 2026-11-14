package com.rcsouza.giroapp.feature.nav

import kotlinx.serialization.Serializable


@Serializable
sealed class Screens{

    @Serializable
    data object SplashScreen: Screens()

    @Serializable
    data object HomeScreen: Screens()



}