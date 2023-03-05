package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel


class CourtCounterViewModel : ViewModel() {

    // Added the following variables because we want them stored in the ViewModel
    var scoreTeamA = 0
    var scoreTeamB = 0

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