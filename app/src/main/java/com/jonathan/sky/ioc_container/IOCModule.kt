package com.jonathan.sky.ioc_container

import org.koin.core.module.Module

object IOCModule {
    val iocModuleList = mutableListOf<Module>()

    fun addViewModelModule(viewModel: Module) {
        iocModuleList.add(viewModel)
    }

    fun addModule(module: Module) {
        iocModuleList.add(module)
    }
}

