// Ejercicio 2 Piedra, Papel, Tijera

import java.util.Random  //para generar un números aleatorios


fun main() {
    val opciones = listOf("piedra", "papel", "tijera")  //lista con las opciones
    val computadora = opciones[Random().nextInt(opciones.size)]

    println("Elige: piedra, papel o tijera")
    val usuario = readLine()?.lowercase() // convierte a minúsculas para evitar errores

    if (usuario !in opciones) {
        println("Opción no válida")
        return
    }

    println("La computadora eligió: $computadora")

    if (usuario == computadora) {
        println("Empate!!!")
    } else if ((usuario == "piedra" && computadora == "tijera") ||
        (usuario == "papel" && computadora == "piedra") ||
        (usuario == "tijera" && computadora == "papel")) {
        println("¡¡Ganaste!!")
    } else {
        println("Perdiste :( ")
    }

}
