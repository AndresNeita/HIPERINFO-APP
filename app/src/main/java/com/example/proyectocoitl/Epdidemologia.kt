package com.example.proyectocoitl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Epdidemologia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_epdidemologia)

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