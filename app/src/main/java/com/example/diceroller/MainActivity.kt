package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollDice1()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val result: TextView = findViewById(R.id.textView)
        result.text = diceRoll.toString()
    }
    private fun rollDice1() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val result1: TextView = findViewById(R.id.textView2)
        result1.text = diceRoll.toString()
    }
}

private class Dice(val numberSides: Int) {

    fun roll(): Int {
        return (1..numberSides).random()
    }
}