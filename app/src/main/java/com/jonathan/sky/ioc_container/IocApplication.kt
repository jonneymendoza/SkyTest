package com.jonathan.sky.ioc_container

import android.app.Application
import com.jonathan.sky.di.DependencyGraph
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

abstract class IocApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupIOcContainer()
    }

    fun setupIOcContainer(){
        startKoin {
            androidContext(this@IocApplication)
            // Koin Android logger
            androidLogger(Level.ERROR)
            modules(DependencyGraph().getAllModules())
        }
    }

}