// Descripción: Interacción con Imágenes
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 28/03/2025

package com.example.pdm_2025_i


import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia 
        val imageView = findViewById<ImageView>(R.id.myImage)

        // Evento de clic
        imageView.setOnClickListener {
            Toast.makeText(this, "¡¡¡Has hecho clic en la imagen!!!", Toast.LENGTH_SHORT).show()
        }
    }
}

