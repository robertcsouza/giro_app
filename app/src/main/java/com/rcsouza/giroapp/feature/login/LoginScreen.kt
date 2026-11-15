package com.rcsouza.giroapp.feature.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.rcsouza.giroapp.feature.component.AuthAccountPrompt
import com.rcsouza.giroapp.feature.component.AuthScreenLayout
import com.rcsouza.giroapp.feature.component.AuthTextField
import com.rcsouza.giroapp.feature.component.PrimaryButton
import com.rcsouza.giroapp.ui.theme.GiroAppTheme


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    email: String = "",
    password: String = "",
    onEmailChange: (String) -> Unit = {},
    onPasswordChange: (String) -> Unit = {},
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    AuthScreenLayout(
        title = "Bom ter você\nde volta.",
        description = "Entre para acompanhar seu limite e manter seu negócio em movimento.",
        onBackClick = onBackClick,
        modifier = modifier
    ) {
        AuthTextField(
            value = email,
            onValueChange = onEmailChange,
            label = "E-mail",
            placeholder = "Seu e-mail",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        AuthTextField(
            value = password,
            onValueChange = onPasswordChange,
            label = "Senha",
            placeholder = "Sua senha",
            isPassword = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        PrimaryButton(
            text = "Entrar",
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth()
        )
        AuthAccountPrompt(
            message = "Ainda não tem uma conta?",
            actionLabel = "Criar minha conta",
            onActionClick = onRegisterClick
        )
    }
}

@Preview(name = "Login • Light", showBackground = true, widthDp = 390, heightDp = 844)
@Preview(
    name = "Login • Dark",
    showBackground = true,
    widthDp = 390,
    heightDp = 844,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(name = "Login • Compact", showBackground = true, widthDp = 320, heightDp = 640)
@Composable
private fun LoginScreenPreview() {
    GiroAppTheme(dynamicColor = false) {
        LoginScreen()
    }
}
