//Usuario.kt
// Descripción: Clase para encapsular los datos del usuario y enviarlos.
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 12/04/2025

package com.ejemplo.editorperfil

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Usuario(
    val nombre: String,
    val edad: String,
    val ciudad: String,
    val correo: String
) : Parcelable
