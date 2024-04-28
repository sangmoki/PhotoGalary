package com.sangmoki.bts_photo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
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
                // 넘겨줄 데이터 설정
                intent.putExtra("data", i + 1)
                println(intent.extras?.get("data"))
                startActivity(intent)
            }
        }

    }
}
