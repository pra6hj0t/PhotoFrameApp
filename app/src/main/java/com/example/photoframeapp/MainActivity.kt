package com.example.photoframeapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var currentImage = 0

    var names = arrayOf("Sidhu Mosse Wala", "Daljit Dosanjh","Satinder Sartaj","Ranjit Bawa")

    lateinit var image :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_pre = findViewById<ImageButton>(R.id.img_previous)
        val btn_next = findViewById<ImageButton>(R.id.img_next)
        val name_text = findViewById<TextView>(R.id.name_text)


        btn_pre.setOnClickListener {


            val  idCurrentImageString = "pic$currentImage"
            //convert String value to int Address
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)

            image=findViewById(idCurrentImageInt)
            image.alpha =0f

            currentImage = (4 + currentImage-1)%4



            val  idImageToShowString = "pic$currentImage"
            //convert String value to int Address
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image=findViewById(idImageToShowInt)
            image.alpha =1f

            name_text.text = names[currentImage]


        }

        btn_next.setOnClickListener {

            val  idCurrentImageString = "pic$currentImage"
            //convert String value to int Address
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)

            image=findViewById(idCurrentImageInt)
            image.alpha =0f

            currentImage = (4 + currentImage + 1)%4



            val  idImageToShowString = "pic$currentImage"
            //convert String value to int Address
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image=findViewById(idImageToShowInt)
            image.alpha =1f
            name_text.text = names[currentImage]
        }

    }
}