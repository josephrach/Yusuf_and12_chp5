package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class GameUtamaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_game_utama)

        vsPemain()
    }

    private fun vsPemain(){
        val batuP = findViewById<View>(R.id.img_batuP1)
        val guntingP = findViewById<View>(R.id.img_guntingP1)
        val kertasP = findViewById<View>(R.id.img_kertasP1)
        val batuC = findViewById<View>(R.id.img_batuCom)
        val guntingC = findViewById<View>(R.id.img_guntingCom)
        val kertasC = findViewById<View>(R.id.img_kertasCom)

        val batupIntent = Intent(this, SplashScreenActivity::class.java)
        val guntingpIntent = Intent(this, SplashScreenActivity::class.java)
        val kertaspIntent = Intent(this, SplashScreenActivity::class.java)
        val batucIntent = Intent(this, SplashScreenActivity::class.java)
        val guntingcIntent = Intent(this, SplashScreenActivity::class.java)
        val kertascIntent = Intent(this, SplashScreenActivity::class.java)

        batuP.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih Batu", Toast.LENGTH_SHORT).show()
            startActivity(batupIntent)
        }
        guntingP.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih gunting", Toast.LENGTH_SHORT).show()
            startActivity(guntingpIntent)
        }
        kertasP.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih kertas", Toast.LENGTH_SHORT).show()
            startActivity(kertaspIntent)
        }
        batuC.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih batu", Toast.LENGTH_SHORT).show()
            startActivity(batucIntent)
        }
        guntingC.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih gunting", Toast.LENGTH_SHORT).show()
            startActivity(guntingcIntent)
        }
        kertasC.setOnClickListener(){
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih kertas", Toast.LENGTH_SHORT).show()
            startActivity(kertascIntent)
        }
        Toast.makeText(this , "fungsi berjalan", Toast.LENGTH_SHORT).show()
    }
}