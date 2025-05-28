/**
    Descripción: Aplicación Personal
    Autor: Allison Mayra Usedo Quispe
    Fecha creación: 25/05/2025
 **/

import 'package:flutter/material.dart';
import 'pantalla_inicio.dart';
// import 'pantalla_perfil.dart';
// import 'pantalla_hobbies.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Mi App Personal',
      home: PantallaInicio(), // Cambiar  PantallaPerfil()  PantallaHobbies()
    );
  }
}
