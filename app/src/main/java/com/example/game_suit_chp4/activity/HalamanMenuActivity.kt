package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding
import com.example.game_suit_chp4.databinding.FragmentGameUtamaBinding

class HalamanMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_halaman_menu)

        val imgVsPemain = findViewById<View>(R.id.img_menu_vspemain)
        val halIntent = Intent(this,MainActivity::class.java)
        imgVsPemain.setOnClickListener(){
            startActivity(halIntent)
        }
    }
}