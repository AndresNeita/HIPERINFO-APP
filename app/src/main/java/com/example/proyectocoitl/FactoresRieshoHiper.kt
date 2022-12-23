package com.example.proyectocoitl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FactoresRieshoHiper : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.factoresriesgohiper)

        var BontonRiesgo: Button = findViewById(R.id.button)
        var botonAtras : ImageButton = findViewById(R.id.imageButton)

        botonAtras.setOnClickListener{llamarClaseHiper()}
        BontonRiesgo.setOnClickListener { llamarclaseDiabetes() }

        setFullScren(window)
        lightStatusBar(window)





    }

    private fun llamarclaseDiabetes() {

        val llamarClase = Intent(this, diabetes::class.java)
        startActivity(llamarClase)

    }

    private fun llamarClaseHiper() {


        val llamarClase = Intent(this, homehiper::class.java)
        startActivity(llamarClase)

    }

}