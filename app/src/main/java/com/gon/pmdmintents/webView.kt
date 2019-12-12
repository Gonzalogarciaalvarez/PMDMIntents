package com.gon.pmdmintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*
import org.jetbrains.anko.browse

class webView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        //Le damos la funcion de buscar en internet al boton y le indicamos la url
        busqueda.setOnClickListener {
            browse("https://steamuserimages-a.akamaihd.net/ugc/475500450718487368/DC2A6E4A68F1780F0B657426D075D1F22768A10B/")
        }

    }
}
