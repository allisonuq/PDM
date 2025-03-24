// Descripción: Clase CuentaBancaria (saldo y límite)
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 20/03/2025


class CuentaBancaria(private var saldo: Double, private var limiteRetiro: Double) {

    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("Error")
        }
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun retirar(monto: Double) {
        if (monto <= saldo && monto <= limiteRetiro) {
            saldo -= monto
            println("Retiro exitoso")
            println(" Saldo actual: $$saldo")
        } else {
            println("¡¡¡Error !!!")
            println("Retiro no permitido. Es un monto mayor al SALDO o el LIMITE.")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria(1000.0, 500.0)
    println("¡¡¡Cuenta Bancaria!!!")
    println("1 MOVIMIENTO")
    cuenta.retirar(200.0)
    println("2 MOVIMIENTO")
    cuenta.retirar(100.0)
    println("3 MOVIMIENTO")
    cuenta.retirar(600.0)
}
