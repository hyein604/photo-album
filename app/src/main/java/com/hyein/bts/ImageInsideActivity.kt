package com.hyein.bts

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        when(getData){
            "1" -> memberImage.setImageResource(R.drawable.bts_1)
            "2" -> memberImage.setImageResource(R.drawable.bts_2)
            "3" -> memberImage.setImageResource(R.drawable.bts_3)
            "4" -> memberImage.setImageResource(R.drawable.bts_4)
            "5" -> memberImage.setImageResource(R.drawable.bts_5)
            "6" -> memberImage.setImageResource(R.drawable.bts_6)
            "7" -> memberImage.setImageResource(R.drawable.bts_7)
        }
    }
}