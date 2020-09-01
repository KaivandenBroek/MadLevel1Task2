package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var correctsAnswers = 0


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
        val answer1 = binding.answer1.text
        val answer2 = binding.answer2.text
        val answer3 = binding.answer3.text
        val answer4 = binding.answer4.text

        if (answer1.equals(getString(R.string.T))) {
            correct()
        }
        if (answer2.equals(getString(R.string.F))) {
            correct()
        }
        if (answer3.equals(getString(R.string.F))) {
            correct()
        }
        if (answer4.equals(getString(R.string.F))) {
            correct()
        }
        Toast.makeText(this, getString(R.string.correct, correctsAnswers), correctsAnswers).show()

    }

    private fun correct() {
        correctsAnswers++
    }
}