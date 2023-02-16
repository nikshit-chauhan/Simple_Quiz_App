package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        val tvName : TextView = findViewById(R.id.playerName)
        val tvScore : TextView = findViewById(R.id.tvScore)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestion"
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}