# 🥗 Práctica 5  Fragments y Navegaci

Aplicación móvil desarrollada en Kotlin que permite a los usuarios armar un pedido paso a paso utilizando **Fragments**.

## 📱 Características

- Inicio con opción para iniciar un nuevo pedido.
- Selección del tipo de comida.
- Selección de extras.
- Resumen del pedido con opción de confirmarlo o editarlo.


## 🧩 Estructura de la App

| Fragmento | Funcionalidad |
|----------|----------------|
| `InicioFragment` | Pantalla inicial con botón "Nuevo pedido". Navega a `SeleccionComidaFragment`. |
| `SeleccionComidaFragment` | Selección de tipo de comida. Navega a `SeleccionExtrasFragment`. |
| `SeleccionExtrasFragment` | Selección de extras del pedido. Navega a `ResumenPedidoFragment`. |
| `ResumenPedidoFragment` | Muestra el pedido. Permite confirmar (y volver al inicio) o editar (regresar). |

## 📦 Navegación y paso de datos

- Se utiliza `Bundle` para enviar los datos de comida y extras entre fragments.
- Para editar un pedido, `ResumenPedidoFragment` utiliza `setFragmentResult()` para enviar los datos hacia atrás y luego navega de regreso usando `popBackStack()`.
- `SeleccionComidaFragment` y `SeleccionExtrasFragment` usan `setFragmentResultListener()` para recibir los datos y marcar las opciones previamente seleccionadas.


## 🛠️ Tecnologías utilizadas

- **Lenguaje**: Kotlin
- **Entorno**: Android Studio

## 📋 Recomendaciones de uso y desarrollo

- Todos los textos deben estar definidos en `strings.xml`.

## ✅ Funcionalidades implementadas

- [x] Navegación entre fragments.
- [x] Paso de datos con `Bundle`.
- [x] Confirmación y edición del pedido.
- [x] Comunicación entre fragments hacia atrás con `setFragmentResult`.

### 🚀 Mejoras futuras

- **Interfaz más atractiva**: Agregar animaciones  y diseño responsivo para una mejor experiencia de usuario.
- **Agregar precios**: Asignar precios a cada elemento y calcular el total del pedido.
- **Pruebas automatizadas**: Incluir pruebas unitarias.


---
# :star: ¡Gracias por leer!
Espero que este informe haya sido útil.



