package com.example.tamagochiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TamagochiAppMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tamagochi_app_main)

        val Feed = findViewById<Button>(R.id.Feed)
        val Dirt = findViewById<Button>(R.id.Dirt)
        val Pet = findViewById<Button>(R.id.Pet)
        val Hand = findViewById<ImageView>(R.id.Hand)
        val Food = findViewById<ImageView>(R.id.Food)
        val Soap = findViewById<ImageView>(R.id.Soap)


        Feed.setOnClickListener{

        }
        Dirt.setOnClickListener{

        }
        Pet.setOnClickListener {

        }
        Hand.setOnClickListener{

        }
        Food.setOnClickListener{

        }
        Soap.setOnClickListener{

        }
    }
}