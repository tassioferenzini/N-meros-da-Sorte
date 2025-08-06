package com.example.aula01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val botaoSortear = findViewById<Button>(R.id.botaoSortear)
        val result = findViewById<TextView>(R.id.numeros_sorteados)

        botaoSortear.setOnClickListener {
            val numeros = gerarNumeros()
            val resultado = getString(R.string.numeros_sorteados, numeros.joinToString(" - "))
            result.text = resultado
        }
    }

    private fun gerarNumeros(): List<Int> {
        return (1..60).shuffled().take(6).sorted()
    }
}
