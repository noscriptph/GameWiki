package com.noscript.gamewiki.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.noscript.gamewiki.R
import com.noscript.gamewiki.databinding.FragmentMenuJuegosBinding

/**
 * Fragmento que representa el menú de juegos.
 */
class MenuJuegos : Fragment() {

    // Binding para la vista del fragmento
    private var _binding: FragmentMenuJuegosBinding? = null

    // Propiedad solo de lectura para acceder al binding de manera segura
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout usando ViewBinding
        _binding = FragmentMenuJuegosBinding.inflate(inflater, container, false)
        val view = binding.root

        // findNavController hacia buscador de juegos
        binding.idTxtbuscador.setOnClickListener {
            findNavController().navigate(R.id.action_menuJuegos_to_buscadorJuegos)
        }

        // findNavController hacia favoritos
        binding.idTxtFavoritos.setOnClickListener {
            findNavController().navigate(R.id.action_menuJuegos_to_favoritos)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Liberar el binding cuando la vista se destruya
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        // Eliminar el fragmento de la memoria una vez que deje de ser visible
        activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commitAllowingStateLoss()
    }
}