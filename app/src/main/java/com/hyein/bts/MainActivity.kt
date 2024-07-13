package com.hyein.bts

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 프로그램이 화면이 클릭 되었다는것을 알아야 한다.
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener{
            // 토스트 메세지 띄우기
            // Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여준다.
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","1") // data라는 이름의 변수에 1이라는 값 담아서 intent로 보내기
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        image2.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }

        var image3 = findViewById<ImageView>(R.id.bts_image_3)
        image3.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }

        var image4 = findViewById<ImageView>(R.id.bts_image_4)
        image4.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data",'4')
            startActivity(intent)
        }

        var image5 = findViewById<ImageView>(R.id.bts_image_5)
        image5.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }

        var image6 = findViewById<ImageView>(R.id.bts_image_6)
        image6.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }

        var image7 = findViewById<ImageView>(R.id.bts_image_7)
        image7.setOnClickListener{
            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }

    }
}