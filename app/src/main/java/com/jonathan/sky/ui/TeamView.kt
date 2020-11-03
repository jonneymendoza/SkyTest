package com.jonathan.sky.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

class TeamView {

    @Composable
    fun getTeamView(team: String) {
        MaterialTheme() {
            background(shape = RoundedCornerShape(10.dp), team)
        }
    }

    @Composable
    private fun background(shape: Shape, team: String) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center).padding(5.dp)) {
            Box(
                modifier = Modifier.clip(shape).background(Color.LightGray)
            ) {
                Text(
                    text = team, modifier = Modifier.padding(12.dp).fillMaxWidth(0.8f).align(
                        Alignment.TopStart
                    )
                )
            }
        }
    }
}