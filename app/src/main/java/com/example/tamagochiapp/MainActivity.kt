package com.example.tamagochiapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


     val getStarted = findViewById<Button>(R.id.getStarted)
     getStarted.setOnClickListener{
        val intent = Intent(this, TamagochiAppMain::class.java)
         startActivity(intent)
    }


    }
}