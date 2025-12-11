package com.rafael.loginappavaliacao.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rafael.loginappavaliacao.R
import com.rafael.loginappavaliacao.databinding.ActivityLoginBinding
import com.rafael.loginappavaliacao.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotao()
    }

    private fun configurarBotao() {

        binding.btnEntrar.setOnClickListener {

            val emailDigitado = binding.edtEmail.text.toString().trim()
            val senhaDigitada = binding.edtPassword.text.toString().trim()

            val emailCorreto = "aluno@email.com"
            val senhaCorreta = "123456"

            if (emailDigitado == emailCorreto && senhaDigitada == senhaCorreta) {

                // Login correto → navegar para Home
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("nome", "Aluno")
                startActivity(intent)

            } else {

                Toast.makeText(this, "E-mail ou senha inválidos", Toast.LENGTH_SHORT).show()

                binding.inputEmail.error = " "
                binding.inputPassword.error = " "
            }
        }
    }
}