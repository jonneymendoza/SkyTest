package com.jonathan.sky.domain

interface FootballRepositoryContract {

    fun getFootballTeams(): List<String>
    fun getFootballPlayers() : List<String>
}