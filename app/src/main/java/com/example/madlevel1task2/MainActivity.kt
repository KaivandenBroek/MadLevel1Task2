package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init btnSubmit
        binding.btnSubmit.setOnClickListener {
            checkAnswers()
        }

    }

    /*
    Checks the textfields for the answers
     */
    private fun checkAnswers() {
        var correctsAnswers = 0
        val answer1 = binding.answer1.text.toString()
        val answer2 = binding.answer2.text.toString()
        val answer3 = binding.answer3.text.toString()
        val answer4 = binding.answer4.text.toString()

        if (answer1 == getString(R.string.T)) {
            correctsAnswers++
        }
        if (answer2 == getString(R.string.F)) {
            correctsAnswers++
        }
        if (answer3 == getString(R.string.F)) {
            correctsAnswers++
        }
        if (answer4 == getString(R.string.F)) {
            correctsAnswers++
        }
        Toast.makeText(this, getString(R.string.correct, correctsAnswers), Toast.LENGTH_SHORT)
            .show()

    }
}