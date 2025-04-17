# Editor de Perfil

Aplicación Android  que permite al usuario ingresar datos personales, visualizar un resumen y confirmar la información.

**Funcionalidades:**

* Ingreso de datos (nombre, edad, ciudad, correo) en `FormularioActivity`.
* Visualización de resumen en `ResumenActivity`.
* Persistencia de datos durante la rotación de pantalla.
* Uso de `Intent` para el paso de datos entre actividades.
* Uso de `Parcelable` para la clase `Usuario`.
* Uso de `ActivityResult` para manejar el resultado de la confirmación.

**Tecnologías:**

* Kotlin
* Android Studio

**Estructura del proyecto:**

* `FormularioActivity.kt`: Actividad para ingresar datos.
* `ResumenActivity.kt`: Actividad para mostrar y confirmar datos.
* `Usuario.kt`: Data class para el objeto Usuario.


