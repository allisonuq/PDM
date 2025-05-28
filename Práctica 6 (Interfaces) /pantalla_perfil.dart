/**
    Descripción: Pantalla para mostrar  los datos
    Autor: Allison Mayra Usedo Quispe
    Fecha creación: 25/05/2025
 **/

import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Mi Perfil'),
        backgroundColor: Colors.teal, // color
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Image.network('https://'),
            const SizedBox(height: 16),
            const Text(
              'Allison',
              style: TextStyle(
                fontSize: 20,
                color: Colors.teal, // color
                fontWeight: FontWeight.bold,
              ),
            ),
            const Text(
              'Estudiante',
              style: TextStyle(color: Colors.grey),
            ),
            const SizedBox(height: 16),
            Row(
              children: const [
                Icon(Icons.email, color: Colors.teal),
                SizedBox(width: 8),
                Text(
                  'allisonusedo14@gmail.com',
                  style: TextStyle(color: Colors.black87),
                ),
              ],
            ),
            Row(
              children: const [
                Icon(Icons.phone, color: Colors.teal),
                SizedBox(width: 8),
                Text(
                  '+51 986537680',
                  style: TextStyle(color: Colors.black87),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
