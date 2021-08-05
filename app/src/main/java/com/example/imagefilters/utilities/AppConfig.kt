package com.example.imagefilters.utilities

import android.app.Application
import com.example.imagefilters.dependencyinjection.repositoryModule
import com.example.imagefilters.dependencyinjection.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

@Suppress("unused")
class AppConfig : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppConfig)
            modules(listOf(repositoryModule, viewModule))
        }
    }
}