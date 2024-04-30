package com.example.tamagotchiapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView = findViewById<ImageView>(R.id.avatar)

        val playButton = findViewById<Button>(R.id.playButton)

        val feedButton = findViewById<Button>(R.id.feedButton)

        val bathButton = findViewById<Button>(R.id.BathButton)

        var happinessMeter = findViewById<TextView>(R.id.happinessMeter)

        var hungerMeter = findViewById<TextView>(R.id.hungerMeter)

        var cleanlinessMeter = findViewById<TextView>(R.id.cleanlinessMeter)

        playButton?.setOnClickListener {
            imageView.setImageResource(R.drawable.dog_playing)

        }

        feedButton?.setOnClickListener {
            imageView.setImageResource(R.drawable.dog_eating)
        }

        bathButton?.setOnClickListener {
            imageView.setImageResource(R.drawable.dog_bathing)
        }





    }
}