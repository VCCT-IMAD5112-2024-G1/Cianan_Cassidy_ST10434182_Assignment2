package com.example.tamagochiapp

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TamagochiAppMain : AppCompatActivity() {
    private lateinit var handler: Handler
    private lateinit var hungerMeter: TextView
    private lateinit var happyMeter: TextView
    private lateinit var dirtMeter: TextView

    private var hungerValue = 10
    private var happyValue = 10
    private var dirtValue = 10

    private val delayMillis = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tamagochi_app_main)

        // Buttons to click
        val feed = findViewById<Button>(R.id.feed)
        val dirt = findViewById<Button>(R.id.dirt)
        val pet = findViewById<Button>(R.id.pet)

        // Images that show
        val hand = findViewById<ImageView>(R.id.hand)
        val food = findViewById<ImageView>(R.id.food)
        val soap = findViewById<ImageView>(R.id.soap)

        // Countdown meters
        hungerMeter = findViewById(R.id.hungerMeter)
        happyMeter = findViewById(R.id.happyMeter)
        dirtMeter = findViewById(R.id.dirtMeter)

        handler = Handler()

        // Start the countdown
        startCountdown()

        // Button actions
        feed.setOnClickListener {
            food.visibility = View.VISIBLE
            resetMeterValues()
        }

        dirt.setOnClickListener {
            soap.visibility = View.VISIBLE
            resetMeterValues()
        }

        pet.setOnClickListener {
            hand.visibility = View.VISIBLE
            resetMeterValues()
        }
    }

    private fun startCountdown() {
        handler.postDelayed(object : Runnable {
            override fun run() {
                hungerMeter.text = hungerValue.toString()
                happyMeter.text = happyValue.toString()
                dirtMeter.text = dirtValue.toString()

                // Decrease meters
                hungerValue--
                happyValue--
                dirtValue--

                // Check if meters reach zero
                if (hungerValue <= 0 || happyValue <= 0 || dirtValue <= 0) {
                    // Handle game over
                } else {
                    // Schedule the next update
                    handler.postDelayed(this, delayMillis.toLong())
                }
            }
        }, delayMillis.toLong())
    }

    private fun resetMeterValues() {
        hungerValue = 10
        happyValue = 10
        dirtValue = 10
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}
