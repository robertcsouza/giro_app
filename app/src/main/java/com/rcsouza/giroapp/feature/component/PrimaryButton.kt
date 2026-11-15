package com.rcsouza.giroapp.feature.component

import android.R.attr.enabled
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rcsouza.giroapp.ui.theme.AccentLight
import com.rcsouza.giroapp.ui.theme.FontSize
import com.rcsouza.giroapp.ui.theme.OnPrimaryDark
import com.rcsouza.giroapp.ui.theme.manrope
import com.rcsouza.giroapp.ui.theme.manropeBold

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    enabled: Boolean = true,
    onClick: () -> Unit,
    btColor: ButtonColors = ButtonColors(containerColor = AccentLight,
        contentColor = OnPrimaryDark
        ,disabledContainerColor = Color.Gray,
        disabledContentColor = AccentLight.copy(alpha = 0.6f)
    )
) {

    Button( modifier = modifier.fillMaxWidth(),
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        onClick = onClick,
        colors = btColor
    ) {

        if (icon != null) {
            Icon(
                modifier = Modifier.size(14.dp),
                painter = icon,
                contentDescription = "Button Icon"
            )
        }
        Text(text,
            fontSize = FontSize.REGULAR,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(8.dp),
            fontFamily = manropeBold()
            )
        Spacer(modifier = Modifier.width(12.dp))
    }


}


@Preview(showBackground = true)
@Composable
private fun PrimaryButtonPreview() {
        PrimaryButton(text = "Login", onClick = {})
}