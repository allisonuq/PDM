/**
Descripción: Para seleccionar los extras del pedido
Autor: Allison Mayra Usedo Quispe
Fecha creación: 20/04/2025
 **/

package com.tuapp.comida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tuapp.comida.databinding.FragmentSeleccionExtrasBinding

class SeleccionExtrasFragment : Fragment() {

    private var _binding: FragmentSeleccionExtrasBinding? = null
    private val binding get() = _binding!!

    private var comida: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeleccionExtrasBinding.inflate(inflater, container, false)

        // Recuperar comida del bundle
        comida = arguments?.getString("comida")

        binding.btnSiguienteExtras.setOnClickListener {
            val extras = mutableListOf<String>()
            if (binding.cbBebida.isChecked) extras.add(getString(R.string.bebida))
            if (binding.cbPapas.isChecked) extras.add(getString(R.string.papas))
            if (binding.cbPostre.isChecked) extras.add(getString(R.string.postre))

            val bundle = Bundle().apply {
                putString("comida", comida)
                putString("extras", extras.joinToString(", "))
            }

            findNavController().navigate(R.id.action_seleccionExtrasFragment_to_resumenPedidoFragment, bundle)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
