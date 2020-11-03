package com.jonathan.sky.domain.usecase

import com.jonathan.sky.domain.FootballRepositoryContract
import io.mockk.every
import io.mockk.mockk
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.inject

/**
 * Simple unit test that tests the use case.
 *
 * upon 2nd stage interview, i can show you TDD of me first creating the test case for the use case related to GetAllPlayersUseCase
 *
 *
 */
class GetFootballTeamUseCaseTest : KoinTest {

    private val footballRepository: FootballRepositoryContract by inject()
    private lateinit var getFootballTeamUseCase: GetFootballTeamUseCase

    @Before
    fun setup() {
        startKoin {
            modules(
                module {
                    factory { mockk<FootballRepositoryContract>(relaxed = true) }
                })

        }
        getFootballTeamUseCase = GetFootballTeamUseCase(footballRepository)

    }

    @Test
    fun `test Teams Not Empty`() {
        every { footballRepository.getFootballTeams() }.returns(listOf("TeamA", "TeamB", "TeamC"))
        val teams = getFootballTeamUseCase.getFootballTeams()
        Assert.assertTrue(teams.isNotEmpty())
    }

    @Test
    fun `test teamB exists`() {
        every { footballRepository.getFootballTeams() }.returns(listOf("TeamA", "TeamB", "TeamC"))
        val teams = getFootballTeamUseCase.getFootballTeams()
        Assert.assertTrue(teams.contains("TeamB"))
    }

    @After
    fun cleanUp() {
        stopKoin()
    }

}