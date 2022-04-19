package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class GameUtamaActivity : AppCompatActivity() {
    val bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_game_utama)

        val bundle = intent.extras
        val pilihanUser = bundle?.getString("pilihanUser")
//        val pilihanUser2 = bundle?.getInt("pilihanMenu2")
//        val hasilJumlah = pilihanUser1?.plus(pilihanUser2!!)
        print(pilihanUser)
//        Toast.makeText(this, "${pilihanUser}", Toast.LENGTH_SHORT).show()

        when(pilihanUser){
            "saya 1" -> vsPemain()
            "saya 2" -> vsComputer()
            else -> Toast.makeText(this, "ini error", Toast.LENGTH_SHORT).show()
        }

    }

    private fun vsPemain() {
        println("berak")

        val batuP = findViewById<View>(R.id.img_batuP1)
        val guntingP = findViewById<View>(R.id.img_guntingP1)
        val kertasP = findViewById<View>(R.id.img_kertasP1)
        val batuC = findViewById<View>(R.id.img_batuCom)
        val guntingC = findViewById<View>(R.id.img_guntingCom)
        val kertasC = findViewById<View>(R.id.img_kertasCom)

        val halamanIntent = Intent(this, SplashScreenActivity::class.java)

        batuP.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih Batu", Toast.LENGTH_SHORT)
                .show()

            startActivity(halamanIntent)
        }
        guntingP.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih gunting", Toast.LENGTH_SHORT)
                .show()
            startActivity(halamanIntent)
        }
        kertasP.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player1 memilih kertas", Toast.LENGTH_SHORT)
                .show()
            startActivity(halamanIntent)
        }
        batuC.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih batu", Toast.LENGTH_SHORT)
                .show()
            startActivity(halamanIntent)
        }
        guntingC.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih gunting", Toast.LENGTH_SHORT)
                .show()
            startActivity(halamanIntent)
        }
        kertasC.setOnClickListener() {
            Toast.makeText(this@GameUtamaActivity, "Player2 memilih kertas", Toast.LENGTH_SHORT)
                .show()
            startActivity(halamanIntent)
        }
    }

    private fun vsComputer() {
        println("tai")
    }

    fun permainan(){
    }
}
