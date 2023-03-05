package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    /*
    Moved the following to CourtCounterViewModel.kt:
    var scoreTeamA = 0
    var scoreTeamB = 0
    */
    private lateinit var binding: ActivityMainBinding

    // Create a reference to CourtCounterViewModel
    private val courtCounterViewModel: CourtCounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    // Add the display functions to display the stored scores upon onCreate
        // This is because the displayed number resets to 0 when the app is rotated
        displayForTeamA(courtCounterViewModel.scoreTeamA)
        displayForTeamB(courtCounterViewModel.scoreTeamB)

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        //scoreTeamA++
        courtCounterViewModel.add1TeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        //scoreTeamA += 2
        courtCounterViewModel.add2TeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        //scoreTeamA += 3
        courtCounterViewModel.add3TeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        //scoreTeamB++
        courtCounterViewModel.add1TeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        //scoreTeamB += 2
        courtCounterViewModel.add2TeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        //scoreTeamB += 3
        courtCounterViewModel.add3TeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        courtCounterViewModel.resetScores()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}