package com.rcsouza.giroapp.feature.register

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

data class RegisterFormState(
    val name: String = "",
    val email: String = "",
    val password: String = ""
)


class RegisterViewModel(): ViewModel(){

    var registrFormState by mutableStateOf(RegisterFormState())

    fun updateName(name: String){ registrFormState = registrFormState.copy(name = name)}
    fun updateEmail(email: String){ registrFormState = registrFormState.copy(email =email)}
    fun updatePassword(password: String){registrFormState = registrFormState.copy(password =
            password)}

    fun createCustomer(){

        Log.d( "register", registrFormState.toString())

    }



}