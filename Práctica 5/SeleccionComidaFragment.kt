/**
Descripción:  Para seleccionar el tipo de comida
Autor: Allison Mayra Usedo Quispe
Fecha creación: 20/04/2025
**/
package com.tuapp.comida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tuapp.comida.databinding.FragmentSeleccionComidaBinding

class SeleccionComidaFragment : Fragment() {

    private var _binding: FragmentSeleccionComidaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeleccionComidaBinding.inflate(inflater, container, false)

        binding.btnSiguienteComida.setOnClickListener {
            val selectedId = binding.radioGroupComidas.checkedRadioButtonId

            if (selectedId != -1) {
                val comidaSeleccionada = view?.findViewById<RadioButton>(selectedId)?.text.toString()
                val bundle = Bundle().apply {
                    putString("comida", comidaSeleccionada)
                }
                findNavController().navigate(R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment, bundle)
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
