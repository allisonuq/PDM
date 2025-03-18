// Ejercicio 3 Calculadora Elemental

fun main() {
    while (true) {
        println("---- MENÚ ----")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Elige una opción: ")

        val opcion = readLine()?.toIntOrNull()  //Para convertir a número entero

        if (opcion == 1) {
            operar("suma") { a, b -> a + b }
        } else if (opcion == 2) {
            operar("resta") { a, b -> a - b }
        } else if (opcion == 3) {
            operar("multiplicación") { a, b -> a * b }
        } else if (opcion == 4) {
            operar("división") { a, b -> if (b != 0) a / b else { println("No  dividir entre 0"); null } }
        } else if (opcion == 5) {
            println("Saliendo...")
            println("Salida exitosa")
            break
        } else {
            println("Opción no válida")
            println("Inténtalo de nuevo")
        }
    }
}

fun operar(operacion: String, operacionFuncion: (Int, Int) -> Int?) {
    print("Ingresa el primer número: ")
    val num1 = readLine()?.toIntOrNull()
    print("Ingresa el segundo número: ")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        val resultado = operacionFuncion(num1, num2)
        resultado?.let { println("El resultado de la $operacion es: $it") }
    } else {
        println("Entrada no válida. Inténtalo de nuevo.")
    }
}
