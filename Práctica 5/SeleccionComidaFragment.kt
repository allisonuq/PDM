/**
 * Descripción:  Para seleccionar el tipo de comida
 * Autor: Allison Mayra Usedo Quispe
 * Fecha creación: 20/04/2025
 * Fecha última modificación: 23/04/2025
 */
package com.tuapp.comida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSiguienteComida.setOnClickListener {
            val selectedId = binding.radioGroupComidas.checkedRadioButtonId

            if (selectedId != -1) {
                val comidaSeleccionada = view.findViewById<RadioButton>(selectedId).text.toString()
                val bundle = Bundle().apply {
                    putString("comida", comidaSeleccionada)
                }
                findNavController().navigate(
                    R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment,
                    bundle
                )
            }
        }

        // Agregamos para recibir datos del ResumenPedidoFragment
        
        setFragmentResultListener("editarPedido") { _, bundle ->
            val comidaRecuperada = bundle.getString("comida")
            val comidaId = when (comidaRecuperada) {
                getString(R.string.pizza) -> 0
                getString(R.string.hamburguesa) -> 1
                getString(R.string.ensalada) -> 2
                else -> -1
            }
            if (comidaId != -1) {
                val radioButton = binding.radioGroupComidas.getChildAt(comidaId)
                if (radioButton is RadioButton) {
                    radioButton.isChecked = true
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
