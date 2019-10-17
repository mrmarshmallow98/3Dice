package com.example.a3dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.a3dice.R
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }


    private fun rollDice() {

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText1.text = "Dice Rolled!"

        val randomInt = Random().nextInt(6) + 1
        resultText1.text = randomInt.toString()

        val randomInt1 = Random().nextInt(6) + 1
        resultText2.text = randomInt1.toString()

        val randomInt2 = Random().nextInt(6) + 1
        resultText3.text = randomInt2.toString()
    }


}
