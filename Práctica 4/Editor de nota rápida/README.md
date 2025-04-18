# Editor de Nota Rápida

Aplicación Android para permitir al usuario escribir una nota, visualizarla en otra pantalla y elegir compartirla o editarla nuevamente.

**Funcionalidades:**

* **EditorActivity:**
    * Permite al usuario escribir una nota en un campo de texto.
    * Botón "Compartir" para enviar la nota a la siguiente actividad.
    * Guarda el contenido de la nota al rotar la pantalla.

* **OpcionesActivity:**
    * Muestra la nota recibida en un TextView.
    * Botón "Compartir por correo".
    * Botón "Editar de nuevo" para volver a la pantalla de edición.

**Tecnologías:**

* Kotlin
* Android Studio


**Estructura del proyecto:**

* `EditorActivity.kt`: Actividad para escribir la nota.
* `OpcionesActivity.kt`: Actividad para mostrar y gestionar la nota.
* `activity_editor.xml`: Layout para la actividad de edición.
* `activity_opciones.xml`: Layout para la actividad de opciones.


**Prácticas implementadas:**

* Comunicación de datos entre actividades usando `Intent`.
* Envío de información de regreso usando `ActivityResult`.
* Guardar el contenido de la nota al rotar la pantalla con `onSaveInstanceState()`.
