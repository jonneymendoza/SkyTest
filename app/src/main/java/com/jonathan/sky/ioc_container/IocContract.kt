package com.jonathan.sky.ioc_container

/**
 * Interface used to create the dependency mappings based on Clear code Architecture
 */
interface IocContract {

    /**
     * Create the main app dependency, ie database object, shared preferences etc.
     */
    fun createMainAppDependency()

    /**
     * Create the repository object
     */
    fun createRepoDependency()

    /**
     * Create the network layer objects
     */
    fun createNetworkDependency()

    /**
     * Create the Apps UI objects
     */
    fun createUiDependency()

    /**
     * Create the UseCase dependancy
     */
    fun createUseCaseDependency()
}