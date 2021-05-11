package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = (N1.text.toString()).toDouble()
            val nota2 = (N2.text.toString()).toDouble()
            val media = (nota1 + nota2 )/2
            val faltas = Integer.parseInt(N3.text.toString())

            if (media >= 6 && faltas<=10){
              resultado.setText("O Aluno foi aprovado"+ "\n"+"Nota Final: "+ media+"\n"+"Faltas: "+ faltas)
              resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("O Aluno foi reprovado"+ "\n"+"Nota Final: "+ media+"\n"+"Faltas: "+ faltas)
                resultado.setTextColor(Color.RED)
            }

        }
    }
}