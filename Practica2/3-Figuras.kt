// Descripción: Clases de figuras geométricas (área y perímetro)
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 23/03/2025


abstract class Shape {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun imprimirResultados() {
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
    }
}

class Cuadrado(private val lado: Double) : Shape() {
    override fun calcularArea() = lado * lado
    override fun calcularPerimetro() = 4 * lado

}

class Rectangulo(private val base: Double, private val altura: Double) : Shape() {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro() = 2 * (base + altura)
}

class Circulo(private val radio: Double) : Shape() {
    override fun calcularArea() = Math.PI * radio * radio
    override fun calcularPerimetro() = 2 * Math.PI * radio
}

fun main() {
    val cuadrado = Cuadrado(4.0)
    println("=====================================")
    println(" RESULTADOS DEL CUADRADO")
    println("=====================================")
    println(" Área: ${cuadrado.calcularArea()}")
    println(" Perímetro: ${cuadrado.calcularPerimetro()}")
    println("=====================================")

    val rectangulo = Rectangulo(5.0, 3.0)
    println(" RESULTADOS DEL RECTANGULO")
    println("=====================================")
    println(" Área: ${rectangulo.calcularArea()}")
    println(" Perímetro: ${rectangulo.calcularPerimetro()}")
    println("=====================================")

    val circulo = Circulo(2.5)
    println(" RESULTADOS DEL CIRCULO")
    println("=====================================")
    println(" Área: ${circulo.calcularArea()}")
    println(" Perímetro: ${circulo.calcularPerimetro()}")
    println("=====================================")
}
