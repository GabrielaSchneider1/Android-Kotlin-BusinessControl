package com.example.businesscontrol.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.businesscontrol.R


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

    override fun onResume() {

        GlobalScope.launch {
            delay(5000)

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

            finish()
        }

        super.onResume()
    }
}