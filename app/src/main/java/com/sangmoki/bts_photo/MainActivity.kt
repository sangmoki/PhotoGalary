package com.sangmoki.bts_photo

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
        // 화면 그려주는 코드
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        // 이미지를 불러와 변수에 저장
//        val image1 = findViewById<ImageView>(R.id.image_1)
//
//        // 이미지 클릭 시 발생 이벤트
//        image1.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Toast 메시지 출력
//            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts1Activity::class.java)
//            startActivity(intent)
//        }
//
//        // 나머지 image에 이름을 다 붙이고, 각각 클릭 시 다른 액티비티로 이동!
//        val image2 = findViewById<ImageView>(R.id.image_2)
//        val image3 = findViewById<ImageView>(R.id.image_3)
//        val image4 = findViewById<ImageView>(R.id.image_4)
//        val image5 = findViewById<ImageView>(R.id.image_5)
//        val image6 = findViewById<ImageView>(R.id.image_6)
//        val image7 = findViewById<ImageView>(R.id.image_7)
//
//        image2.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts2Activity::class.java)
//            startActivity(intent)
//        }
//
//        image3.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts3Activity::class.java)
//            startActivity(intent)
//        }
//
//        image4.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts4Activity::class.java)
//            startActivity(intent)
//        }
//
//        image5.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts5Activity::class.java)
//            startActivity(intent)
//        }
//
//        image6.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts6Activity::class.java)
//            startActivity(intent)
//        }
//
//        image7.setOnClickListener {
//
//            // 1번 이미지 클릭 시 Bts1Activity로 이동
//            val intent = Intent(this, Bts7Activity::class.java)
//            startActivity(intent)
//        }

        // 이미지 ID 배열
        val imageIds = arrayOf(R.id.image_1, R.id.image_2, R.id.image_3, R.id.image_4, R.id.image_5, R.id.image_6, R.id.image_7)

        // 클릭할 때 실행할 액티비티 클래스 배열
        val activityClasses = arrayOf(
            Bts1Activity::class.java,
            Bts2Activity::class.java,
            Bts3Activity::class.java,
            Bts4Activity::class.java,
            Bts5Activity::class.java,
            Bts6Activity::class.java,
            Bts7Activity::class.java
        )

        // 이미지에 대한 클릭 이벤트 리스너 설정
        for (i in imageIds.indices) {
            findViewById<ImageView>(imageIds[i]).setOnClickListener {
                val intent = Intent(this, activityClasses[i])
                startActivity(intent)
            }
        }

    }
}
