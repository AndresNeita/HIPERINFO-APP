package com.example.proyectocoitl

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class sintomashiper : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sintomashiper)

        var botonAtras : ImageButton = findViewById(R.id.imageButton)

        botonAtras.setOnClickListener{llamarClaseHiper()}

        setFullScren(window)
        lightStatusBar(window)

    }

    private fun llamarClaseHiper() {


        val llamarClase = Intent(this, homehiper::class.java)
        startActivity(llamarClase)

    }
}