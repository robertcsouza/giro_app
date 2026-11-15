package com.rcsouza.giroapp.feature.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rcsouza.giroapp.ui.theme.FontSize
import com.rcsouza.giroapp.ui.theme.manrope
import com.rcsouza.giroapp.ui.theme.manropeBold

@Composable
fun AuthScreenLayout(
    title: String,
    description: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .imePadding(),
            contentAlignment = Alignment.TopCenter
        ) {
            LazyColumn(
                modifier = Modifier
                    .widthIn(max = 480.dp)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                item {
                    TextButton(onClick = onBackClick) {
                        Text(
                            text = "← Voltar",
                            fontFamily = manropeBold(),
                            fontSize = FontSize.REGULAR,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
                item { AuthBrand() }
                item {
                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Text(
                            text = title,
                            fontFamily = manropeBold(),
                            fontSize = FontSize.LARGE,
                            lineHeight = 38.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Text(
                            text = description,
                            fontFamily = manrope(),
                            fontSize = FontSize.REGULAR,
                            lineHeight = 22.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(20.dp),
                        content = content
                    )
                }
            }
        }
    }
}
