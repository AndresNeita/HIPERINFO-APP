package com.example.proyectocoitl

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class diabetes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diabetes)

        setFullScren(window)
        lightStatusBar(window)

        var botonAtras : ImageButton= findViewById(R.id.imageButton)

        botonAtras.setOnClickListener{llamarClaseHiper()}

        val values = resources.getStringArray(R.array.pacientes)

        val text : TextView = findViewById(R.id.textView14)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, values)



    }

    private fun llamarClaseHiper() {

        val llamarClase = Intent(this, homehiper::class.java)
        startActivity(llamarClase)

    }
}