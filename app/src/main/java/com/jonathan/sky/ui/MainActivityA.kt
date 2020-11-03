package com.jonathan.sky.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import com.jonathan.sky.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivityA : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showTopTeams()
        }
    }

    @Composable
    fun showTopTeams() {
        val footballTeams = mainViewModel.getFootballTeams()
        LazyColumnFor(items = footballTeams, itemContent = {
            MaterialTheme() {
                TeamView().getTeamView(it)
            }
        })

    }
}