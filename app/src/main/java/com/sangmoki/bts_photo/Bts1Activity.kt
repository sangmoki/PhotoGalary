package com.sangmoki.bts_photo

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bts1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bts1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 넘겨져 온 데이터 받아 Toast로 출력
        val getData = intent.getIntExtra("data", 0)

        val memberImage = findViewById<ImageView>(R.id.btsImageArea)

        if (getData == 1) {
            memberImage.setImageResource(R.drawable.bts_1)
            Toast.makeText(this,"1번 이미지", Toast.LENGTH_SHORT).show()
        }
    }
}