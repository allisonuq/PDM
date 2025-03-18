// Ejercicio 4 Adivina Número

import kotlin.random.Random //para generar un números aleatorios

fun main() {
    val numeroSecreto = Random.nextInt(1, 30) // N° aleatorio entre 1 y 30
    var intentos = 5
    var adivinado = false

    println("¡¡¡ BIENVENIDO AL JUEGO !!!")
    println("      ADIVINA EL NÚMERO  ")
    println("------------------------------")
    println("Tienes 5 intentos para adivinar el número que esta entre 1 y 30")

    while (intentos > 0 && !adivinado) {
        print("Ingresa tu  intento: ")
        val intento = readLine()?.toIntOrNull() // convierte a números , evitar errores

        if (intento == null || intento !in 1..30) {
            println("NO válido ")
            println("Por favor, ingresa un número entre 1 y 30")
            continue
        }

        if (intento < numeroSecreto) {
            println("El número es MAYOR")
        } else if (intento > numeroSecreto) {
            println("El número es MENOR")
        } else {
            println("  ¡¡¡Felicidades!!! ")
            println("Has adivinado el número.")
            adivinado = true
        }

        intentos--
        if (!adivinado && intentos > 0) {
            println("Te quedan $intentos intentos")
        }
    }

    if (!adivinado) {
        println("Game Over. El número era $numeroSecreto")
    }
}
