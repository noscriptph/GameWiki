package com.noscript.gamewiki

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
        setContentView(binding.root)

        // Configura los insets de la ventana
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStop() {
        super.onStop()
        // Libera recursos cuando la actividad deja de ser visible
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Minimiza la aplicación en lugar de cerrarla
        moveTaskToBack(true)
    }
}