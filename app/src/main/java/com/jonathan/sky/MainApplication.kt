package com.jonathan.sky

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            // Koin Android logger
            androidLogger(Level.ERROR)
            modules(DependencyGraph.getAllModules())
        }
    }
}