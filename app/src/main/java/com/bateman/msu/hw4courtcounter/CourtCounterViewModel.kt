package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

// Create two current score constants for our SavedStateHandle
const val CURRENT_SCORE_TEAM_A_KEY = "CURRENT_SCORE_TEAM_A_KEY"
const val CURRENT_SCORE_TEAM_B_KEY = "CURRENT_SCORE_TEAM_B_KEY"

class CourtCounterViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    // Added the following variables because we want them stored in the ViewModel
    // and create getters and setters to retrieve the current score for each team
    var scoreTeamA : Int
    // Team A score getter; if no saved state handle, set to 0
    get() = savedStateHandle.get(CURRENT_SCORE_TEAM_A_KEY) ?: 0
    // Team A score setter
    set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_A_KEY, value)

    var scoreTeamB : Int
    // Team B score getter; if no saved state handle, set to 0
    get() = savedStateHandle.get(CURRENT_SCORE_TEAM_B_KEY) ?: 0
    // Team B score setter
    set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_B_KEY, value)

    // Add function(s) that allows you to add points to the scoreTeam variables
    /*
    * Team A Functions
    */
    fun add1TeamA() {
        scoreTeamA++
    }
    fun add2TeamA() {
        scoreTeamA += 2
    }
    fun add3TeamA() {
        scoreTeamA += 3
    }
    /*
    * Team B Functions
    */
    fun add1TeamB() {
        scoreTeamB++
    }
    fun add2TeamB() {
        scoreTeamB += 2
    }
    fun add3TeamB() {
        scoreTeamB += 3
    }

    fun resetScores() {
        scoreTeamA = 0
        scoreTeamB = 0
    }


}