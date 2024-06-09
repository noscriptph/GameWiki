package com.noscript.gamewiki.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.noscript.gamewiki.R
import com.noscript.gamewiki.databinding.FragmentBuscadorJuegosBinding


/**
 * Fragmento que representa el menú de buscador.
 */
class BuscadorJuegos : Fragment() {

    private var _binding: FragmentBuscadorJuegosBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBuscadorJuegosBinding.inflate(inflater, container, false)
        val view = binding.root

        // findNavController hacia menu juegos
        binding.idTxtJuegos.setOnClickListener {
            findNavController().navigate(R.id.action_buscadorJuegos_to_menuJuegos)
        }

        // findNavController hacia favoritos
        binding.idTxtFavoritos.setOnClickListener {
            findNavController().navigate(R.id.action_buscadorJuegos_to_favoritos)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}