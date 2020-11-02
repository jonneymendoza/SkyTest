package com.jonathan.sky.ioc_container

import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object IOCModule {
    val iocModuleList = mutableListOf<Module>()
    inline fun <reified T> addFactoryModule(t: T) {
        iocModuleList.add(module { factory { t } })
    }

    inline fun <reified T> addSingleModule(t: T) {
        iocModuleList.add(module { single { t } })
    }

    inline fun <reified T : ViewModel> addViewModelModule(viewModel: T) {
        iocModuleList.add(module { viewModel { viewModel } })
    }
}

