// EditorActivity.kt
// Descripción: Pantalla para escribir una nota y enviarla a otra actividad.
// Autor: Allison Mayra Usedo Quispe
// Fecha de creación: 16/04/2025
package com.ejemplo.editornota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditorActivity : AppCompatActivity() {

    private lateinit var etNota: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        // Referencias a vistas
        etNota = findViewById(R.id.etNota)
        val btnCompartir: Button = findViewById(R.id.btnCompartir)

        // Enviar nota a Opciones Activity
        btnCompartir.setOnClickListener {
            val nota = etNota.text.toString()
            val intent = Intent(this, OpcionesActivity::class.java).apply {
                putExtra("NOTA", nota)
            }
            startActivity(intent) 
        }
    }
}
