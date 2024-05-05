package com.example.tamagotchiapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartPage : AppCompatActivity(){
    //initialised the pet levels
    private var happinessLevel: Int = 10
    private var hungerLevel: Int = 25
    private var cleanlinessLevel: Int = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //declared the variables being used in the layout
        val imageView = findViewById<ImageView>(R.id.avatar)
        val playButton = findViewById<Button>(R.id.playButton)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val bathButton = findViewById<Button>(R.id.BathButton)
        val happinessCounter = findViewById<EditText>(R.id.happinessMeter)
        val hungerCounter = findViewById<EditText>(R.id.hungerMeter)
        val cleanlinessCounter = findViewById<EditText>(R.id.cleanlinessMeter)

        //set the initial text values and changed them to string
        happinessCounter.setText(happinessLevel.toString())
        hungerCounter.setText(hungerLevel.toString())
        cleanlinessCounter.setText(cleanlinessLevel.toString())

        //set a function that detects when the button is pressed
        playButton?.setOnClickListener {

            //when the button is pressed, this imagine will be displayed
            imageView.setImageResource(R.drawable.dog_playing)

            //when the button is pressed, the values in our edit text will be updated according to the parameters below

            //happiness increases by 15
            happinessLevel += 15

            //hunger increases by 10
            hungerLevel += 10

            //cleanliness decreases by 7
            cleanlinessLevel -= 7
            happinessCounter.setText(happinessLevel.toString())

        }
        //set a function that detects when the button is pressed
        feedButton?.setOnClickListener {

            //when the button is pressed, this imagine will be displayed
            imageView.setImageResource(R.drawable.dog_eating)

            //when the button is pressed, the values in our edit text will be updated according to the parameters below

            //happiness decreases by 2
            happinessLevel -= 2

            //hunger decreases by 20
            hungerLevel -= 20

            //cleanliness decreases by 5
            cleanlinessLevel -= 5
            hungerCounter.setText(hungerLevel.toString())

        }
        //set a function that detects when the button is pressed
        bathButton?.setOnClickListener {

            //when the button is pressed, this imagine will be displayed
            imageView.setImageResource(R.drawable.dog_bathing)

            //when the button is pressed, the values in our edit text will be updated according to the parameters below

            //happiness decreased by 10
            happinessLevel -= 10

            //hunger increases by 15
            hungerLevel += 15

            //cleanliness increases by 30
            cleanlinessLevel += 30
            cleanlinessCounter.setText(cleanlinessLevel.toString())

        }
    }

}