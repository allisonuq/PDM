// FormularioActivity.kt
// Descripción: Para que el usuario ingrese  sus datos personales.
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 12/04/2025

package com.ejemplo.editorperfil

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity


class FormularioActivity : AppCompatActivity() {

    // Campos del Formulario
    
    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText

    // Claves para poder  guardar estado en rotación de  la pantalla
    
    private val KEY_NOMBRE = "key_nombre"
    private val KEY_EDAD = "key_edad"
    private val KEY_CIUDAD = "key_ciudad"
    private val KEY_CORREO = "key_correo"

    // Registrar para y asi obtener resultados de ResumenActivity
    
    private val resumenLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == Activity.RESULT_OK) {
            val confirmado = it.data?.getBooleanExtra("CONFIRMADO", false) ?: false
            if (confirmado) {
                Toast.makeText(this, "El perfil se guardado correctamente", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        // Referencias a los campos
        
        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etCiudad = findViewById(R.id.etCiudad)
        etCorreo = findViewById(R.id.etCorreo)

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)

        // Restaurar datos si esta ne moviemiento lapantalla ( se gira la pantalla)
        
        savedInstanceState?.let {
            etNombre.setText(it.getString(KEY_NOMBRE, ""))
            etEdad.setText(it.getString(KEY_EDAD, ""))
            etCiudad.setText(it.getString(KEY_CIUDAD, ""))
            etCorreo.setText(it.getString(KEY_CORREO, ""))
        }

        btnContinuar.setOnClickListener {
            val usuario = Usuario(
                etNombre.text.toString(),
                etEdad.text.toString(),
                etCiudad.text.toString(),
                etCorreo.text.toString()
            )

            val intent = Intent(this, ResumenActivity::class.java)
            intent.putExtra("USUARIO", usuario)
            resumenLauncher.launch(intent)
        }
    }

    // Guardar el  estado al rotar la pantalla
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_NOMBRE, etNombre.text.toString())
        outState.putString(KEY_EDAD, etEdad.text.toString())
        outState.putString(KEY_CIUDAD, etCiudad.text.toString())
        outState.putString(KEY_CORREO, etCorreo.text.toString())
    }
}
