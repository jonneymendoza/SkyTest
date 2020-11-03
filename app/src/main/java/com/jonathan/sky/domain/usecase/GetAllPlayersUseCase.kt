package com.jonathan.sky.domain.usecase

import com.jonathan.sky.domain.FootballRepositoryContract

class GetAllPlayersUseCase constructor(private val footballRepositoryContract: FootballRepositoryContract) {

    fun getAllPlayers(): List<String> {
        return footballRepositoryContract.getFootballPlayers()
    }
}