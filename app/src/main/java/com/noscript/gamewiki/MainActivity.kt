package com.noscript.gamewiki

import android.content.Context
import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.noscript.gamewiki.databinding.ActivityMainBinding

/**
 * MainActivity es la actividad principal de la aplicación.
 * Se encarga de configurar la vista principal y manejar los eventos de la ventana.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inicializa el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Establece la vista de contenido de la actividad con el root del binding
        setContentView(binding.root)

        // Configura los insets de la ventana
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            // Obtiene los insets de las barras del sistema
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            // Establece el padding de la vista principal
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtiene el NavController usando findNavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerViewPrincipal)
        // Si no hay un estado guardado, establece el gráfico de navegación inicial
        val navController = navHostFragment?.findNavController()
        if (savedInstanceState == null) {
            if (navController != null) {
                navController.setGraph(R.navigation.nav_graph)
            }

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Minimiza la aplicación en lugar de cerrarla
        moveTaskToBack(true)
    }
}