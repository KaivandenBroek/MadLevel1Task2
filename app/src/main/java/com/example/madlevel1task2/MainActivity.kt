package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val answer1 = binding.answer1.text.toString()
        val answer2 = binding.answer2.text.toString()
        val answer3 = binding.answer3.text.toString()
        val answer4 = binding.answer4.text.toString()

    }
}