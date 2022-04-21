package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.fragment.LandingPageFragment1
import com.example.game_suit_chp4.fragment.LandingPageFragment3

class LandingPageActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_landing_page1)
        val lp2Indtent = Intent(this, LandingPageActivity2::class.java)

        val btnLanjut = findViewById<Button>(R.id.btn_lp1_lanjut)
        btnLanjut.setOnClickListener{
            startActivity(lp2Indtent)
        }

    }
}