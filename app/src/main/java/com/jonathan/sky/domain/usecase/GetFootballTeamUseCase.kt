package com.jonathan.sky.domain.usecase

import com.jonathan.sky.domain.FootballRepositoryContract

class GetFootballTeamUseCase constructor(private val footballRepositoryContract: FootballRepositoryContract) {

    fun getFootballTeams(): List<String> {
        return footballRepositoryContract.getFootballTeams()
    }
}