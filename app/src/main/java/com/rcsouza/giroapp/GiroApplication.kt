package com.rcsouza.giroapp

import android.app.Application
import com.rcsouza.giroapp.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class GiroApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GiroApplication)
            modules(appModule)
        }
    }
}