package com.example.proyectocoitl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Afectaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afectaciones)

        var botonAtras : ImageButton = findViewById(R.id.imageButton)
        botonAtras.setOnClickListener{llamarClaseHiper()}

        setFullScren(window)
        lightStatusBar(window)

    }

    private fun llamarClaseHiper() {
        val llamarClase = Intent(this, MainActivity::class.java)
        startActivity(llamarClase)
    }
}