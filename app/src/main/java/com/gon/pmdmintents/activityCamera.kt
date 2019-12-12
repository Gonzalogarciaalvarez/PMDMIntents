package com.gon.pmdmintents

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_camera.*

class activityCamera : AppCompatActivity() {

    val CAMERA_REQUEST=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        button_camera_take.setOnClickListener {
            dispatchTakePictureIntent(it)
    }

        private fun dispatchTakePictureIntent(y: View) {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
                takePictureIntent.resolveActivity(packageManager)?.also {
                    startActivityForResult(takePictureIntent,CAMERA_REQUEST)
                }
            }
        }

        fun cam(y: View){
            val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            if (callCameraIntent.resolveActivity(packageManager) != null) {
                startActivityForResult(callCameraIntent,CAMERA_REQUEST)
            }
        }
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            when(requestCode){
                CAMERA_REQUEST->{
                    if(resultCode== Activity.RESULT_OK && data != null){
                        photoimageView.setImageBitmap(data.extras?.get("data") as Bitmap)
                    }

                }
                else ->{
                    Toast.makeText(this,"codigo mal", Toast.LENGTH_SHORT).show()
                }
            }
        }

}
