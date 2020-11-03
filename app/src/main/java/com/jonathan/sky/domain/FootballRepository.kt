package com.jonathan.sky.domain

class FootballRepository : FootballRepositoryContract {
    override fun getFootballTeams(): List<String> {
        val footballTeams = mutableListOf<String>()

        footballTeams.add("Arsenal")
        footballTeams.add("Liverpool")
        footballTeams.add("Tottenham")
        footballTeams.add("Everton")
        footballTeams.add("Manchester City")
        footballTeams.add("Leeds United")
        footballTeams.add("Chelsea")

        return footballTeams
    }

    override fun getFootballPlayers(): List<String> {
        val players = mutableListOf<String>()

        players.add("Harry Kane")
        players.add("Abameyang")
        players.add("Henry")
        players.add("Dixon")
        players.add("Mane")
        players.add("Kante")
        players.add("Pogba")
        players.add("Pepe")
        players.add("Rodriguez")
        players.add("Aguero")

        return players
    }

}