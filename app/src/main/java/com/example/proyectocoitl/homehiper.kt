package com.example.proyectocoitl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.sql.RowId

class homehiper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homhiper)


        val bttnHome : ImageButton = findViewById(R.id.homebtn)

        val imaRiesgo : ImageView = findViewById(R.id.imageView2)
        val imgEpidemo : ImageView = findViewById(R.id.imageView3)
        val imgSintoma : ImageView = findViewById(R.id.imageView4)
        val imgComplicaciones : ImageView = findViewById(R.id.imageView5)
        val imgPrevencion : ImageView = findViewById(R.id.imageView6)


        val textRiesgo : TextView = findViewById(R.id.textView4)
        val textEpidemo : TextView = findViewById(R.id.textView5)
        val textSinto : TextView = findViewById(R.id.textView6)
        val textCompli : TextView = findViewById(R.id.textView9)
        val textPreven : TextView = findViewById(R.id.textView7)


        textRiesgo.setOnClickListener{llamarclaseRiesgo()}
        textEpidemo.setOnClickListener{llamarclaseEpidemo()}
        textSinto.setOnClickListener{llamarclaseSintomas()}
        textCompli.setOnClickListener{llamarclaseComplicaciones()}
        textPreven.setOnClickListener{llamarclasePrevencion()}

        imaRiesgo.setOnClickListener{llamarclaseRiesgo()}
        imgEpidemo.setOnClickListener{llamarclaseEpidemo()}
        imgSintoma.setOnClickListener{llamarclaseSintomas()}
        imgComplicaciones.setOnClickListener{llamarclaseComplicaciones()}
        imgPrevencion.setOnClickListener{llamarclasePrevencion()}

        bttnHome.setOnClickListener{llamarClaseHome()}

        setFullScren(window)
        lightStatusBar(window)

    }

    private fun llamarclaseRiesgo() {

        val llamarClase = Intent(this, FactoresRieshoHiper::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado riesgos", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseEpidemo() {

        val llamarClase = Intent(this, epidemologia::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado epidemologia", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseSintomas() {

        val llamarClase = Intent(this, sintomashiper::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado sintomas", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseComplicaciones() {

        val llamarClase = Intent(this, complicacioneshiper::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado complicaciones", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclasePrevencion() {

        val llamarClase = Intent(this, medidasprevenhiper::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado prevenciones", Toast.LENGTH_SHORT).show()

    }

    private fun llamarClaseHome() {
        val llamarClase = Intent(this, Home::class.java)
        startActivity(llamarClase)
    }

}
