package com.noscript.gamewiki.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.noscript.gamewiki.databinding.FragmentMenuJuegosBinding

/**
 * Fragmento que representa el menú de juegos.
 */
class MenuJuegos : Fragment() {

    private var _binding: FragmentMenuJuegosBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento usando ViewBinding
        _binding = FragmentMenuJuegosBinding.inflate(inflater, container, false)
        return binding.root
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