package com.rcsouza.giroapp.core.di

import com.rcsouza.giroapp.feature.register.RegisterViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule  = module {
    viewModelOf(::RegisterViewModel)
}