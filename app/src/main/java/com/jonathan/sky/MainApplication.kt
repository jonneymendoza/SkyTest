package com.jonathan.sky

import android.app.Application
import com.jonathan.sky.di.DependencyGraph
import com.jonathan.sky.ioc_container.IocApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Can extend the abstract class of IocApplication.class to automatoically setup the ioc container
 */
class MainApplication : IocApplication() {

    override fun onCreate() {
        super.onCreate()
    }
}