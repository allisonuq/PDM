// Ejercicio 1 Evaluación Empleados

fun main() {
    print("Ingrese su salario al mes : ")
    val salario = readLine()?.toDoubleOrNull() ?: return println("valido")

    print("Ingrese su puntuación: ")
    val puntuacion = readLine()?.toDoubleOrNull() ?: return println("valido")

    val nivel = if (puntuacion in 0.0..3.0) {
        "Inaceptable"
    } else if (puntuacion in 4.0..6.0) {
        "Aceptable"
    } else if (puntuacion in 7.0..10.0) {
        "Meritorio"
    } else {
        "Puntuación es entre 0 y 10"
    }

    val dineroRecibido = salario * (puntuacion / 10)

    println("Nivel de Rendimiento: $nivel")
    println("Dinero Recibido: $$dineroRecibido")
}
