package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var imagedice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
//         Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
           rolldice()
        }
        imagedice = findViewById(R.id.dice_image)
    }

    private fun rolldice() {
        val randomno= Random.nextInt(6)+1
        val resourceImage=
            when(randomno){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else-> R.drawable.dice_6
            }
        imagedice.setImageResource(resourceImage)
    }
}