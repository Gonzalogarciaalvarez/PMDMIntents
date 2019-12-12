package com.gon.pmdmintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

const val PICK_REQUEST = 1
const val CAMERA_REQUEST = 3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Le damos las funciones a los distintos botones que llamaran a los retos
        bcalculo.setOnClickListener{
            val intento=Intent(this,calculo::class.java);
            startActivity(intento)
        }

        bBrowser.setOnClickListener {
            val myIntent = Intent(this, webView::class.java);

            startActivity(myIntent);

        }
        btncamara.setOnClickListener {
            accamara(it)
        }

    }


    fun accamara(y: View) {

        val miintent = Intent(this, activityCamera::class.java)
        startActivity(miintent)


    }
}

