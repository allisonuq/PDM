// OpcionesActivity.kt
// Descripción: Muestra la nota y permite compartirla o editarla.
// Autor: Allison Mayra Usedo Quispe
// Fecha de creación: 16/04/2025

package com.ejemplo.editornota

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OpcionesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        // Referencias a las vistas
        val tvNota: TextView = findViewById(R.id.tvNota)
        val btnCorreo: Button = findViewById(R.id.btnCorreo)
        val btnEditar: Button = findViewById(R.id.btnEditar)

        // Obtener la nota recibida
        val nota: String = intent.getStringExtra("NOTA").orEmpty()

        // Mostrar la nota en el TextView
        tvNota.text = nota
        
        // Acción para compartir por correo
        btnCorreo.setOnClickListener {
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
        }
    }
}
