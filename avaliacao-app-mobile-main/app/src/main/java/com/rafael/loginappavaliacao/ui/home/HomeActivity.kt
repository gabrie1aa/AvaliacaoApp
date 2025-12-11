package com.rafael.loginappavaliacao.ui.home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rafael.loginappavaliacao.R
import com.rafael.loginappavaliacao.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarTela()
    }
    private fun configurarTela() {
        val nomeUsuario = intent.getStringExtra("nome") ?: "Usuário"
        binding.txtBemVindo.text = "Bem-vindo(a), $nomeUsuario"
    }
}