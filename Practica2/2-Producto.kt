// Descripción: Clase Producto (precio y descuento)
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 21/03/2025

class Producto(private var precio: Double, private var descuento: Double) {

    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("Error: El precio no debe ser negativo.")
        }
    }

    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("Error: Descuento debe estar entre 0 y 100")
        }
    }

    fun getPrecioFinal(): Double {
        return precio * (1 - descuento / 100)
    }
}
fun main() {
    val producto = Producto(200.0, 10.0)
    println("Precio original: ${producto.getPrecioFinal() / (1 - 10.0 / 100)}")
    println("Descuento aplicado:  %")
    println("Precio final: ${producto.getPrecioFinal()}")

}
