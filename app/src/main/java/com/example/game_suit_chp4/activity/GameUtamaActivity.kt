package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class GameUtamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_game_utama)


        val batuP = findViewById<View>(R.id.img_aktiveBatuP1)
        val guntingP = findViewById<View>(R.id.img_activeGuntingP1)
        val kertasP = findViewById<View>(R.id.img_activeKertasP1)
        val batuC = findViewById<View>(R.id.img_aktiveBatuCom)
        val guntingC = findViewById<View>(R.id.img_activeGuntingCom)
        val kertasC = findViewById<View>(R.id.img_activeKertasCom)

        val batupIntent = Intent(this, SplashScreenActivity::class.java)
        val guntingpIntent = Intent(this, SplashScreenActivity::class.java)
        val kertaspIntent = Intent(this, SplashScreenActivity::class.java)
        val batucIntent = Intent(this, SplashScreenActivity::class.java)
        val guntingcIntent = Intent(this, SplashScreenActivity::class.java)
        val kertascIntent = Intent(this, SplashScreenActivity::class.java)

        batuP.setOnClickListener(){
            startActivity(batupIntent)
        }
        guntingP.setOnClickListener(){
            startActivity(guntingpIntent)
        }
        kertasP.setOnClickListener(){
            startActivity(kertaspIntent)
        }
        batuC.setOnClickListener(){
            startActivity(batucIntent)
        }
        guntingC.setOnClickListener(){
            startActivity(guntingcIntent)
        }
        kertasC.setOnClickListener(){
            startActivity(kertascIntent)
        }
    }
}