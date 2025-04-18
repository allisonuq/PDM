// EditorActivity.kt
// Descripción: Pantalla para escribir una nota y enviarla a otra actividad.
// Autor: Allison Mayra Usedo Quispe
// Fecha de creación: 16/04/2025
package com.ejemplo.editornota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class EditorActivity : AppCompatActivity() {

    private lateinit var etNota: EditText

    // Registrar para recibir resultado
    private val opcionesLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        val notaEditada = result.data?.getStringExtra("NOTA_EDITADA")
        if (notaEditada != null) {
            etNota.setText(notaEditada)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        etNota = findViewById(R.id.etNota)
        val btnCompartir: Button = findViewById(R.id.btnCompartir)

        btnCompartir.setOnClickListener {
            val nota = etNota.text.toString()
            val intent = Intent(this, OpcionesActivity::class.java).apply {
                putExtra("NOTA", nota)
            }
            opcionesLauncher.launch(intent)
        }
    }
}
