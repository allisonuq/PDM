/**
Descripción: Para mostrar el resumen del pedido y opciones (confirmar o editar)
Autor: Allison Mayra Usedo Quispe
Fecha creación: 20/04/2025
 **/

package com.tuapp.comida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.tuapp.comida.databinding.FragmentResumenPedidoBinding

class ResumenPedidoFragment : Fragment() {

    private var _binding: FragmentResumenPedidoBinding? = null
    private val binding get() = _binding!!

    private var comida: String? = null
    private var extras: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResumenPedidoBinding.inflate(inflater, container, false)

        comida = arguments?.getString("comida")
        extras = arguments?.getString("extras")

        binding.tvResumenComida.text = getString(R.string.comida_seleccionada, comida)
        binding.tvResumenExtras.text = getString(R.string.extras_seleccionados, extras)

        binding.btnConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), getString(R.string.pedido_confirmado), Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_resumenPedidoFragment_to_inicioFragment)
        }

        binding.btnEditar.setOnClickListener {
            setFragmentResult("editarPedido", bundleOf(
                "comida" to comida,
                "extras" to extras
            ))
            findNavController().popBackStack(R.id.seleccionComidaFragment, false)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
