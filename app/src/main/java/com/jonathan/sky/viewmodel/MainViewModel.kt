package com.jonathan.sky.viewmodel

import androidx.lifecycle.ViewModel
import com.jonathan.sky.domain.usecase.GetFootballTeamUseCase

class MainViewModel constructor(private val getFootballTeamUseCase: GetFootballTeamUseCase)  : ViewModel(){

    fun getFootballTeams(): List<String> {
        return getFootballTeamUseCase.getFootballTeams()
    }
}