package com.noscript.gamewiki.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.noscript.gamewiki.R
import com.noscript.gamewiki.databinding.FragmentFavoritosBinding
import com.noscript.gamewiki.databinding.FragmentMenuJuegosBinding

/**
 * Fragmento que representa el menú de favoritos.
 */
class Favoritos : Fragment() {

    private var _binding: FragmentFavoritosBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFavoritosBinding.inflate(inflater, container, false)
        val view = binding.root

        // findNavController hacia menu juegos
        binding.idTxtJuegos.setOnClickListener {
            findNavController().navigate(R.id.action_favoritos_to_menuJuegos)
        }

        // findNavController hacia menu buscador
        binding.idTxtbuscador.setOnClickListener {
            findNavController().navigate(R.id.action_favoritos_to_buscadorJuegos)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}