package com.example.juegodecolores_examenparcial.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.juegodecolores_examenparcial.util.ScoreManager



@Composable
fun ResultScreen(navController: NavController, score: Int) {

    val context = LocalContext.current
    val highScore = ScoreManager.getHighScore(context)


    // Guardamos el nuevo puntaje  mayor
    LaunchedEffect(score) {
        ScoreManager.saveHighScore(context, score)
    }

    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFF48FB1)) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(bottom = 60.dp)) {
                Text(text = "¡RESULTADO DEL JUEGO!",
                    style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Puntuación: $score",
                    style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Mejor puntuación: $highScore",
                    style = MaterialTheme.typography.bodyLarge)
            }

            Button(
                onClick = { navController.navigate("welcome") },
                modifier = Modifier.fillMaxWidth().height(60.dp)
            ) {
                Text(
                    text = "Volver al inicio",
                    style = TextStyle(fontSize = 20.sp, color = Color.Black, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold),
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

