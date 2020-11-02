package com.jonathan.sky

import com.jonathan.sky.ioc_container.IOCModule
import com.jonathan.sky.ioc_container.IocContract
import org.koin.core.module.Module

object DependencyGraph : IocContract {

    override fun createUiDependency() {
        IOCModule.addViewModelModule(MainViewModel())
    }

    override fun createUseCaseDependency() {

    }

    override fun createMainAppDependency() {

    }

    override fun createRepoDependency() {

    }

    override fun createNetworkDependency() {

    }

    fun getAllModules(): List<Module> {
        return IOCModule.iocModuleList.toList()
    }
}