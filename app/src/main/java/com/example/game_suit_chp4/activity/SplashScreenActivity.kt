package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_screen)

        val halIntent = Intent(this, LandingPageActivity1::class.java)

        val toast = Toast.makeText(this, "ini splash screen", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(halIntent)
            this.onStop()
        }, 3000)

    }
}