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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bttnRiesgo: ImageView = findViewById(R.id.imageView2)
        val bttnEpidemo: ImageView = findViewById(R.id.imageView3)
        val bttnSinto  : ImageView = findViewById(R.id.imageView4)
        val bttnCompli  : ImageView = findViewById(R.id.imageView5)
        val bttnPreven : ImageView = findViewById(R.id.imageView6)

        val bttnHome : ImageButton= findViewById(R.id.imageButton2)


        val textRiesgo : TextView = findViewById(R.id.textView4)
        val textEpidemo : TextView = findViewById(R.id.textView5)
        val textSinto : TextView = findViewById(R.id.textView6)
        val textCompli : TextView = findViewById(R.id.textView9)
        val textPreven : TextView = findViewById(R.id.textView7)

        val textafecta : TextView = findViewById(R.id.textView10)


        bttnRiesgo.setOnClickListener{llamarclaseRiesgo()}
        bttnEpidemo.setOnClickListener{llamarclaseEpidemo()}
        bttnSinto.setOnClickListener{llamarclaseSintomas()}
        bttnCompli.setOnClickListener{llamarclaseComplicaciones()}
        bttnPreven.setOnClickListener{llamarclasePrevencion()}

        bttnHome.setOnClickListener{llamarClaseHome()}

        textafecta.setOnClickListener{llamarclaseComoAfecta()}
        textRiesgo.setOnClickListener{llamarclaseRiesgo()}
        textEpidemo.setOnClickListener{llamarclaseEpidemo()}
        textSinto.setOnClickListener{llamarclaseSintomas()}
        textCompli.setOnClickListener{llamarclaseComplicaciones()}
        textPreven.setOnClickListener{llamarclasePrevencion()}



        setFullScren(window)
        lightStatusBar(window)

    }

    private fun llamarclaseRiesgo() {

        val llamarClase = Intent(this, Factores_de_riesgo::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado riesgos", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseEpidemo() {

        val llamarClase = Intent(this, epidemologia::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado epidemologia", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseSintomas() {

        val llamarClase = Intent(this, Sintomas::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado sintomas", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseComplicaciones() {

        val llamarClase = Intent(this, Complicaciones::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado complicaciones", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclasePrevencion() {

        val llamarClase = Intent(this, Medidas_preventivas::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado prevenciones", Toast.LENGTH_SHORT).show()

    }

    private fun llamarclaseComoAfecta() {

        val llamarClase = Intent(this, Afectaciones::class.java)
        startActivity(llamarClase)
        Toast.makeText(this, "usted a seleccionado prevenciones", Toast.LENGTH_SHORT).show()

    }

    private fun llamarClaseHome() {
        val llamarClase = Intent(this, Home::class.java)
        startActivity(llamarClase)
    }

}