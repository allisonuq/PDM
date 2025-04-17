// ResumenActivity.kt
// Descripción: Perfil para ingresar y confirmarlo o editarlo.
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 12/04/2025

package com.ejemplo.editorperfil

import ...

class ResumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)


        val tvResumen = findViewById<TextView>(R.id.tvResumen)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)
        val btnEditar = findViewById<Button>(R.id.btnEditar)
    }
}
