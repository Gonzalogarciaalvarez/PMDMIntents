package com.gon.pmdmintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_calculo.*

class calculo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)


        // Botón para hacer la suma
        btnSuma.setOnClickListener{
            val numero1 = Integer.parseInt(numero1.text.toString())
            val numero2 = Integer.parseInt(numero2.text.toString())
            val suma = numero1 + numero2
            txtResultado.setText(suma.toString())
        }


        // Botón para hacer la resta
        btnResta.setOnClickListener{
            val numero1 = Integer.parseInt(numero1.text.toString())
            val numero2 = Integer.parseInt(numero2.text.toString())
            val resta = numero1 - numero2
            txtResultado.setText(resta.toString())
        }


        // Botón para hacer la multiplicación
        btnMultiplicar.setOnClickListener {
            val numero1 = Integer.parseInt(numero1.text.toString())
            val numero2 = Integer.parseInt(numero2.text.toString())
            val multi = numero1 * numero2
            txtResultado.setText(multi.toString())
        }


        // Botón para hacer la división
        btnDividir.setOnClickListener {
            val numero1 = Integer.parseInt(numero1.text.toString())
            val numero2 = Integer.parseInt(numero2.text.toString())
            val division = numero1 / numero2
            txtResultado.setText(division.toString())

        }

    }
}
