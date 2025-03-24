// Descripción: Sistema de gestión de biblioteca (préstamo y devolución)
// Autor: Allison Mayra Usedo Quispe
// Fecha creación: 23/03/2025


abstract class Informacion(val titulo: String, val autor: String, val anioPublicacion: Int) {
    abstract fun mostrarDetalles()

}

class Libro(titulo: String, autor: String, anioPublicacion: Int, val genero: String, val numPaginas: Int) :
    Informacion(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println(" Libro: \"$titulo\"")
        println(" Autor: $autor")
        println(" Año: $anioPublicacion")
        println(" Género: $genero")
        println(" Páginas: $numPaginas")

    }
}

class Revista(titulo: String, autor: String, anioPublicacion: Int, val issn: String, val volumen: Int, val numero: Int, val editorial: String) :
    Informacion(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println(" Revista: \"$titulo\"")
        println(" Autor: $autor")
        println(" Año: $anioPublicacion")
        println(" ISSN: $issn")
        println(" Volumen: $volumen, Número: $numero")
        println(" Editorial: $editorial")}
}

data class Usuario(val nombre: String, val apellido: String, val edad: Int)

interface IBiblioteca {
    fun registrarInformacion(material: Informacion)
    fun registrarUsuario(usuario: Usuario)
    fun prestarInformacion(usuario: Usuario, material: Informacion)
    fun devolverInformacion(usuario: Usuario, material: Informacion)
    fun mostrarMaterialesDisponibles()
    fun mostrarMaterialesReservados(usuario: Usuario)
    fun mostrarUsuarios()
}

class Biblioteca : IBiblioteca {
    private val materialesDisponibles = mutableListOf<Informacion>()
    private val usuarios = mutableMapOf<Usuario, MutableList<Informacion>>()

    override fun registrarInformacion(material: Informacion) {
        materialesDisponibles.add(material)
        println(" Material registrado: \"${material.titulo}\"")
    }

    override fun registrarUsuario(usuario: Usuario) {
        usuarios[usuario] = mutableListOf()
            println(" Usuario registrado: ${usuario.nombre} ${usuario.apellido} edad: ${usuario.edad}")
    }

    override fun prestarInformacion(usuario: Usuario, material: Informacion) {
        if (materialesDisponibles.contains(material)) {
            usuarios[usuario]?.add(material)
            materialesDisponibles.remove(material)
            println("\"${material.titulo}\" ha sido prestado a ${usuario.nombre}.")
        } else {
            println("El material \"${material.titulo}\" no está disponible para préstamo.")
        }
    }

    override fun devolverInformacion(usuario: Usuario, material: Informacion) {
        if (usuarios[usuario]?.contains(material) == true) {
            usuarios[usuario]?.remove(material)
            materialesDisponibles.add(material)
            println("\"${material.titulo}\" ha sido devuelto por ${usuario.nombre}.")
        } else {
            println("Error: El usuario ${usuario.nombre} no tiene \"${material.titulo}\" en préstamo.")
        }
    }

    override fun mostrarMaterialesDisponibles() {
        println("***  MATERIAL DISPONIBLE EN LA BIBLIOTECA  ***")
        materialesDisponibles.forEach {
            it.mostrarDetalles()
            println("=====================================")
        }

    }

    override fun mostrarMaterialesReservados(usuario: Usuario) {
        println("Materiales reservados por ${usuario.nombre}:")
        usuarios[usuario]?.forEach { it.mostrarDetalles() }
    }
    override fun mostrarUsuarios() {
        println("***  USUARIOS REGISTRADOS  ***")
        usuarios.keys.forEach {
            println("${it.nombre} ${it.apellido} (Edad: ${it.edad})")
        }
        println("======================================")
    }

}

fun main() {
    val biblioteca = Biblioteca()

    // Materiales
    val libro1 = Libro("1984", "George Orwell", 1949, "Distopía", 328)
    val libro2 = Libro("El cuento", "Margaret Atwood", 1985, "Distopía", 500)
    val revista1 = Revista("Science Today", "Varios", 2021, "1234-5678", 10, 5, "Editorial Ciencia")

    // Usuarios
    val usuario1 = Usuario("Juan", "Pérez", 25)
    val usuario2 = Usuario("Ani", "Lazo", 16)


    // Registro
    biblioteca.registrarInformacion(libro1)
    biblioteca.registrarInformacion(libro2)
    biblioteca.registrarInformacion(revista1)
    biblioteca.registrarUsuario(usuario1)
    biblioteca.registrarUsuario(usuario2)

    // Mostrar información
    biblioteca.mostrarMaterialesDisponibles()
    biblioteca.mostrarUsuarios()

    // Préstamo
    biblioteca.prestarInformacion(usuario1, libro1)
    biblioteca.prestarInformacion(usuario2, libro2)
    biblioteca.mostrarMaterialesReservados(usuario1)

    // Devolución
    biblioteca.devolverInformacion(usuario1, libro1)
    biblioteca.devolverInformacion(usuario1, libro2)
    biblioteca.mostrarMaterialesDisponibles()
}
