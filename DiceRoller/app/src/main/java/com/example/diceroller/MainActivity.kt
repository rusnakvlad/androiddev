package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private fun rollDice() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView.text = dice.roll().toString()
        resultTextView2.text = dice.roll().toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice();
        }
    }
}

class Dice(val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random();
    }
}