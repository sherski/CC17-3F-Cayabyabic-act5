package com.example.cc17_3f_cayabyabic_act5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nextN_am
        val nextN_am: Button = findViewById(nextN_am)
        nextN_am.setOnClickListener{
            nextN_am()
        }
    }

    private fun nextN_am() {
        val diceMA = DiceMA(6)
        val cubeRoll = diceMA.rollMA()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.__starry_night)

        when (cubeRoll) {
            1 -> diceImage.setImageResource(R.drawable.__mona_lisa_by_leonardo)
            2 -> diceImage.setImageResource(R.drawable.__the_persistence_of_memory)
            3 -> diceImage.setImageResource(R.drawable.__the_girl_with_a_pearl_earring)
            4 -> diceImage.setImageResource(R.drawable.__the_scream_by_edvard_munch)
            5 -> diceImage.setImageResource(R.drawable.__starry_night)
        }
    }

    class DiceMA (val numSidesMa: Int ){
        fun rollMA (): Int {
            return (1..numSidesMa).random()

        }

    }
}
