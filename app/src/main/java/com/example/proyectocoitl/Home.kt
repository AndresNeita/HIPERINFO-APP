package com.example.proyectocoitl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bttn1: Button = findViewById(R.id.bttnHome)
        bttn1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        val bttn2: Button = findViewById(R.id.bttnHome2)
        bttn2.setOnClickListener{
            startActivity(Intent(this, homehiper::class.java))
        }
    }



}