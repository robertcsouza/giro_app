package com.rcsouza.giroapp.feature.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rcsouza.giroapp.ui.theme.GiroAppTheme


@Composable
fun SplashScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center   ) {

        Text("Splash screen")

    }

}


@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    GiroAppTheme() {
        SplashScreen()
    }
}