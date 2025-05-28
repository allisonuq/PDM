/**
    Descripción: Pantalla para mostrar lista de hobbies
    Autor: Allison Mayra Usedo Quispe
    Fecha creación: 26/05/2025
 **/

import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  const PantallaHobbies({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Algunos de mis Hobbies'),
        backgroundColor: Color(0xFF00897B), //  Color
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            hobby(' Jugar videojuegos ', Icons.videogame_asset),
            hobby(' Leer libros ', Icons.book),
            hobby(' Escuchar música ', Icons.music_note),
            hobby('Cocinar', Icons.restaurant),
            hobby('Viajar', Icons.flight),
          ],
        ),
      ),
    );
  }

  Widget hobby(String texto, IconData icono) {
    return Row(
      children: [
        Icon(icono),
        const SizedBox(width: 8),
        Text(texto),
      ],
    );
  }
}
