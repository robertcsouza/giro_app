package com.rcsouza.giroapp.feature.register

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.rcsouza.giroapp.feature.component.AuthAccountPrompt
import com.rcsouza.giroapp.feature.component.AuthScreenLayout
import com.rcsouza.giroapp.feature.component.AuthTextField
import com.rcsouza.giroapp.feature.component.PrimaryButton
import com.rcsouza.giroapp.ui.theme.GiroAppTheme
import org.koin.androidx.compose.koinViewModel


@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    name: String = "",
    email: String = "",
    password: String = "",
    onNameChange: (String) -> Unit = {},
    onEmailChange: (String) -> Unit = {},
    onPasswordChange: (String) -> Unit = {},
    onRegisterClick: () -> Unit = {},
    onLoginClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {

    val registerViewModel = koinViewModel<RegisterViewModel>()

    val formState = registerViewModel.registrFormState

    AuthScreenLayout(
        title = "Seu próximo giro\ncomeça aqui.",
        description = "Crie sua conta com seus dados básicos. Sem envio de documentos nesta etapa.",
        onBackClick = onBackClick,
        modifier = modifier
    ) {
        AuthTextField(
            value = formState.name,
            onValueChange = {name-> registerViewModel.updateName(name) },
            label = "Nome",
            placeholder = "Seu nome completo",
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
        )
        AuthTextField(
            value = formState.email,
            onValueChange = {email -> registerViewModel.updateEmail(email)},
            label = "E-mail",
            placeholder = "Seu e-mail",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )
        AuthTextField(
            value = formState.password,
            onValueChange = {password -> registerViewModel.updatePassword(password)},
            label = "Senha",
            placeholder = "Crie sua senha",
            isPassword = true,
            supportingText = "Use 12 ou mais caracteres.",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        PrimaryButton(
            text = "Criar minha conta",
            onClick = {registerViewModel.createCustomer()},
            modifier = Modifier.fillMaxWidth()
        )
        AuthAccountPrompt(
            message = "Já tem uma conta?",
            actionLabel = "Entrar na minha conta",
            onActionClick = onLoginClick
        )
    }
}

@Preview(name = "Cadastro • Light", showBackground = true, widthDp = 390, heightDp = 844)
@Preview(
    name = "Cadastro • Dark",
    showBackground = true,
    widthDp = 390,
    heightDp = 844,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(name = "Cadastro • Compact", showBackground = true, widthDp = 320, heightDp = 640)
@Composable
private fun RegisterScreenPreview() {
    GiroAppTheme(dynamicColor = false) {
        RegisterScreen()
    }
}
