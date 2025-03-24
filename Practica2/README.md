# Práctica 2
## Programación Orientada a Objetos en Kotlin

## :bookmark_tabs: 1. Ejercicios en Kotlin
Este repositorio contiene cuatro programas en Kotlin que implementan conceptos de Programación Orientada a Objetos (POO). Cada programa está en un archivo separado y se ejecuta de manera independiente.

## :bookmark_tabs: 2. Descripción del Proyecto
La práctica abarca los siguientes ejercicios:

### :bulb: 2.1 Cuenta Bancaria
Clase que modela una cuenta bancaria con saldo y un límite de retiro.

### :bulb: 2.2 Producto
Clase que representa un producto con precio y un descuento aplicable.

### :bulb: 2.3 Figuras Geométricas
Clases que heredan de una clase abstracta para calcular área y perímetro de diferentes figuras.

### :bulb: 2.4 Sistema de Gestión de Biblioteca
Sistema que maneja libros, revistas y usuarios, implementando préstamos y devoluciones.

## :bookmark_tabs: 3. Detalles de los Programas

### :bulb: Cuenta Bancaria

- Clase `CuentaBancaria` con atributos de saldo y límite de retiro.
- Métodos para modificar y obtener el saldo.
- Función para realizar un retiro, validando el límite disponible.

### :bulb: Producto

- Clase `Producto` con atributos de precio y descuento.
- Métodos `set` y `get` para modificar y obtener valores.
- Método para calcular el precio final después de aplicar el descuento.

### :bulb: Figuras Geométricas

- Clase abstracta `Shape` con métodos para calcular área y perímetro.
- Subclases `Cuadrado`, `Rectángulo` y `Círculo` que implementan los cálculos.
- Creación de instancias y ejecución de métodos de cada figura.

### :bulb: Sistema de Gestión de Biblioteca

- Clase abstracta `Informacion` con propiedades comunes a libros y revistas.
- Subclases `Libro` y `Revista` con atributos adicionales y método `mostrarDetalles()`.
- Clase `Usuario` para representar a los miembros de la biblioteca.
- Interfaz `IBiblioteca` con métodos de gestión de materiales y usuarios.
- Clase `Biblioteca` que implementa la gestión de préstamos y devoluciones.

## :bookmark_tabs: 4. Cómo Ejecutar
Cada programa tiene su propia función `main()`. Para ejecutarlos:

1. Asegúrate de tener instalado Kotlin y un IDE como IntelliJ IDEA .
2. Copia y pega el código en un archivo `.kt` con el nombre correspondiente (`CuentaBancaria.kt`, `Producto.kt`, etc.).
3. Ejecuta el programa desde el IDE o usando la terminal.

## :bookmark_tabs: 5. Estructura del Código
El código está organizado en clases y métodos, siguiendo los principios de POO.&#x20;

## :bookmark_tabs: 6. Mejoras Potenciale
Algunas mejoras futuras podrían incluir:

- **Cuenta Bancaria**: Agregar funcionalidades como transferencia entre cuentas.
- **Producto**: Permitir múltiples descuentos.
- **Figuras Geométricas**: Extender con más figuras como triángulos o polígonos regulares.
- **Sistema de Biblioteca**: Implementar una base de datos para almacenar información de los materiales y usuarios.

# :star: ¡Gracias por leer!
Espero que esta documentación sea útil. 🚀

