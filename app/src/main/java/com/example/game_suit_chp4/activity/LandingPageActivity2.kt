package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class LandingPageActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_landing_page2)
        Toast.makeText(this, "ini LP2", Toast.LENGTH_SHORT).show()
        val lp2Indtent = Intent(this, LandingPageActivity3::class.java )

        val btnLanjut = findViewById<Button>(R.id.btn_lp2_lanjut)
//        btnLanjut.setOnClickListener()

    }
}