package com.rcsouza.giroapp.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcsouza.giroapp.R
import com.rcsouza.giroapp.feature.component.PrimaryButton
import com.rcsouza.giroapp.ui.theme.AccentLight
import com.rcsouza.giroapp.ui.theme.GiroAppTheme
import com.rcsouza.giroapp.ui.theme.OnAccentLight
import com.rcsouza.giroapp.ui.theme.OnPrimaryDark
import com.rcsouza.giroapp.ui.theme.SurfaceDark
import com.rcsouza.giroapp.ui.theme.SurfaceLight
import com.rcsouza.giroapp.ui.theme.TextColorDark
import com.rcsouza.giroapp.ui.theme.TextColorLight
import com.rcsouza.giroapp.ui.theme.manrope
import com.rcsouza.giroapp.ui.theme.manropeBold


@Composable
fun SplashScreen(navigateToLogin:()-> Unit, navigateToRegister: ()-> Unit) {

    Column(
        modifier = Modifier.fillMaxSize().background(color = OnPrimaryDark),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        ) {
        Row(modifier = Modifier.fillMaxWidth().padding(top = 64.dp, start = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(
                id = R.drawable.logo),
                contentDescription = "Giro app Logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(width = 54.dp, height = 54.dp)

            )
            Text(
                "Giro",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                "lab",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.weight(1f))
            Box(modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(color = OnAccentLight)
                .padding(8.dp)

            ) {
                Text("Feito Pra Quem Empreende",
                    fontSize = 12.sp,
                    fontFamily = manropeBold(),
                    color = AccentLight
                    )
            }
            Spacer(modifier = Modifier.padding(end = 16.dp))
        }

        Image(
            painter = painterResource(R.drawable.splash_image),
            contentDescription = "Splash pix image",
            modifier = Modifier.size(width = 330.dp, height = 330.dp)
        )

      Column(
          modifier = Modifier.fillMaxSize().padding(start = 20.dp),
          horizontalAlignment = Alignment.Start,
          verticalArrangement = Arrangement.Top) {
          Text(
              "Seu Negóco Merece Um",
              modifier = Modifier.fillMaxWidth(0.7f),
              fontSize = 28.sp,
              lineHeight = 40.sp,
              color = Color.White,
              fontFamily = manropeBold()

          )
          Text(
              "novo Giro.",
              modifier = Modifier.fillMaxWidth(0.6f),
              fontSize = 28.sp,
              lineHeight = 40.sp,
              color = AccentLight,
              fontFamily = manropeBold()
          )
          Text(
              "Crédito no Pix para fazer acontecer hoje.",
              modifier = Modifier.fillMaxWidth(0.6f).padding(top = 16.dp),
              fontSize = 12.sp,
              color = AccentLight,
              fontFamily = manrope()
          )
          Spacer(modifier = Modifier.weight(0.8f))
          Column(
              modifier= Modifier.fillMaxWidth().padding(bottom = 32.dp),
              verticalArrangement = Arrangement.Center,
              horizontalAlignment = Alignment.CenterHorizontally

          ) {
              PrimaryButton(text = "Quero Meu Limite", onClick = navigateToRegister, modifier = Modifier.padding
                  (start = 16.dp, end = 16.dp))
              TextButton(onClick = navigateToLogin) {
                  Text("Já Tenho uma conta", fontFamily = manropeBold(), color = Color.White)
              }
          }
      }
    }

}


@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    GiroAppTheme() {
        SplashScreen(navigateToLogin = {}, navigateToRegister = {})
    }
}