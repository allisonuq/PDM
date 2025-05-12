package com.example.juegodecolores_examenparcial.screens

import android.os.CountDownTimer
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.random.Random

@Composable
fun GameScreen(navController: NavController) {
    // Puntuación y tiempo
    var score by remember { mutableStateOf(0) }
    var timeLeft by remember { mutableStateOf(30) }
    var currentColor by remember { mutableStateOf(generateRandomColor()) }
    var colorOptions = remember { listOf(generateRandomColor(), generateRandomColor(), generateRandomColor(), currentColor) }
    var gameOver by remember { mutableStateOf(false) }

    // Temporizador
    val timer = remember {
        object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeft = (millisUntilFinished / 1000).toInt()
            }

            override fun onFinish() {
                gameOver = true
            }
        }
    }

    // Temporizador en la pantalla
    LaunchedEffect(key1 = Unit) {
        timer.start()
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        if (gameOver) {
            // Pantalla de resultados 
            navController.navigate("result/$score")
        } else {
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Tiempo: $timeLeft", style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(20.dp))

                // Color aleatorio de fondo 
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(currentColor)
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}
