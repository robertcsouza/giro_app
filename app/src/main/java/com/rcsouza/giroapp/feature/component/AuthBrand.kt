package com.rcsouza.giroapp.feature.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rcsouza.giroapp.R
import com.rcsouza.giroapp.ui.theme.FontSize
import com.rcsouza.giroapp.ui.theme.manrope
import com.rcsouza.giroapp.ui.theme.manropeBold

@Composable
fun AuthBrand(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Text(
            text = "Giro",
            fontSize = FontSize.EXTRA_MEDIUM,
            fontFamily = manropeBold(),
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = "lab",
            fontSize = FontSize.EXTRA_MEDIUM,
            fontFamily = manrope(),
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}
