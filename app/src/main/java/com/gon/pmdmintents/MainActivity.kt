package com.gon.pmdmintents

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.colorAttr
import org.jetbrains.anko.longToast

const val PICK_REQUEST = 1
const val CAMERA_REQUEST = 3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        longToast("Escoge en cada uno de los botones, el reto que quieras usar")

    //Le damos las funciones a los distintos botones que llamaran a los retos

        bcalculo.setOnClickListener{
            val intento=Intent(this,calculo::class.java);
            bcalculo.setBackgroundColor(Color.GREEN)
            startActivity(intento)

        }

        bBrowser.setOnClickListener {
            val myIntent = Intent(this, webView::class.java);
            bBrowser.setBackgroundColor(Color.GREEN)
            startActivity(myIntent);

        }
        btncamara.setOnClickListener {
            btncamara.setBackgroundColor(Color.GREEN)
            accamara(it)

        }

        bbuscador.setOnClickListener {
            val myIntent = Intent(this, Reto::class.java);
            bbuscador.setBackgroundColor(Color.GREEN)

            startActivity(myIntent);

        }


    }


    fun accamara(y: View) {

        val miintent = Intent(this, activityCamera::class.java)
        startActivity(miintent)


    }
}

