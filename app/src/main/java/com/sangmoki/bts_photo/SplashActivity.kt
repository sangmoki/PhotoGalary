package com.sangmoki.bts_photo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            // 앱의 MainActivity로 넘어가기
            val i = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(i)
            // 현재 액티비티 닫기
            finish()
        }, 1000) // 3초
    }
}