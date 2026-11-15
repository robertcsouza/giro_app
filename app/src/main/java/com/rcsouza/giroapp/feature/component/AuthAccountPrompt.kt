package com.rcsouza.giroapp.feature.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rcsouza.giroapp.ui.theme.FontSize
import com.rcsouza.giroapp.ui.theme.manrope
import com.rcsouza.giroapp.ui.theme.manropeBold

@Composable
fun AuthAccountPrompt(
    message: String,
    actionLabel: String,
    onActionClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = message,
            fontFamily = manrope(),
            fontSize = FontSize.REGULAR,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        TextButton(onClick = onActionClick) {
            Text(
                text = actionLabel,
                fontFamily = manropeBold(),
                fontSize = FontSize.REGULAR,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}
