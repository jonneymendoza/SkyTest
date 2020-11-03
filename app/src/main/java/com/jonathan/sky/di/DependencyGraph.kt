package com.jonathan.sky.di

import com.jonathan.sky.domain.usecase.GetAllPlayersUseCase
import com.jonathan.sky.domain.usecase.GetFootballTeamUseCase
import com.jonathan.sky.domain.FootballRepository
import com.jonathan.sky.domain.FootballRepositoryContract
import com.jonathan.sky.ioc_container.IOCModule
import com.jonathan.sky.ioc_container.IocContract
import com.jonathan.sky.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.KoinComponent
import org.koin.core.module.Module
import org.koin.dsl.module


class DependencyGraph : IocContract, KoinComponent {

    override fun createUiDependency() {
        IOCModule.addViewModelModule(module {
            viewModel { MainViewModel(get()) }
        })
    }

    override fun createUseCaseDependency() {
        IOCModule.addModule(module {
            factory { GetFootballTeamUseCase(get()) }
            factory { GetAllPlayersUseCase(get()) }
        })
    }

    override fun createMainAppDependency() {
        IOCModule.addModule(module {
            //App wide dependencies can go here
        })
    }

    override fun createRepoDependency() {
        IOCModule.addModule(module {
            factory<FootballRepositoryContract> { FootballRepository() }
        })
    }

    override fun createNetworkDependency() {

    }

    fun getAllModules(): List<Module> {
        createUiDependency()
        createUseCaseDependency()
        createMainAppDependency()
        createRepoDependency()
        createNetworkDependency()

        return IOCModule.iocModuleList.toList()
    }
}