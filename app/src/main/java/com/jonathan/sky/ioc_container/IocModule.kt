package com.jonathan.sky.ioc_container

interface IocModule {

    fun <T> addFactoryModule(t: T)

    fun <T> addViewModelModule(t: T)

}