package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * DiceRoller demonstrates simple interactivity in an Android app.
 * It contains one button that updates a text view with a random
 * value between 1 and 6.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        Toast.makeText(this, "dice roll button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = (1..6).random().toString()
    }

    /**
     * Click listener for the Count Up button.
     */
    private fun countUp() {
        Toast.makeText(this, "count up button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val text = resultText.text.toString()
        if (text == "Hello World!") {
            resultText.text = "1"
        } else if (text != "6") {
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }
}
