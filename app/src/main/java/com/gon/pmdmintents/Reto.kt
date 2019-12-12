package com.gon.pmdmintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reto.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.longToast

class Reto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto)
        //En esta activity tenemos un calendario que carga la fecha que tiene el movil para saber que mes y dia mostrarle
        //Y hemos creado un sistema de valoracion mediante 5 estrellas para que el user puntue la app


        longToast("Mira en que dia vives mientras valoras mi app")
    }
}
