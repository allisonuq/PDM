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

        val usuario = intent.getParcelableExtra<Usuario>("USUARIO")
        
        val tvResumen = findViewById<TextView>(R.id.tvResumen)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)
        val btnEditar = findViewById<Button>(R.id.btnEditar)

       

        // Mostrar resumen de datos
        usuario?.let {
            tvResumen.text = """
                Nombre: ${it.nombre}
                Edad: ${it.edad}
                Ciudad: ${it.ciudad}
                Correo: ${it.correo}
            """.trimIndent()
        }

        btnConfirmar.setOnClickListener {
            val resultIntent = Intent().apply {
                putExtra("CONFIRMADO", true)
                }
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        btnEditar.setOnClickListener {
            // Volver sin confirmar
            finish()
        }

    }
}
