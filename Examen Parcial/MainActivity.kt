/**
 Descripción: Juego de colores
 Autor: Allison Mayra Usedo Quispe
 Fecha creación: 09/05/2025
 **/

package com.example.juegodecolores_examenparcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.juegodecolores_examenparcial.ui.theme.JuegoDeColoresExamenParcialTheme
import com.example.juegodecolores_examenparcial.screens.WelcomeScreen
import com.example.juegodecolores_examenparcial.screens.GameScreen
import com.example.juegodecolores_examenparcial.screens.ResultScreen


class MainActivity : ComponentActivity() 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          
            JuegoDeColoresExamenParcialTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeScreen(navController) }
                    composable("game") { GameScreen(navController) }
                    composable("result/{score}") { backStackEntry ->
                        val score = backStackEntry.arguments?.getString("score")?.toIntOrNull() ?: 0
                        ResultScreen(navController, score)
                    }
                }
            }
        }
    }
}
