package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R
//import com.example.game_suit_chp4.databinding.ActivityMainBinding
//import com.example.game_suit_chp4.databinding.FragmentGameUtamaBinding

class HalamanMenuActivity : AppCompatActivity() {

//    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_halaman_menu)

        val bundle = Bundle()
        bundle.putString("nama","awokawok")

        val imgVsPemain = findViewById<View>(R.id.img_menu_vspemain)
        val imgVsCom = findViewById<View>(R.id.img_menu_vscom)

        val halamanIntent = Intent(this, GameUtamaActivity::class.java)

        imgVsPemain.setOnClickListener{
            Toast.makeText(this, "Vs Pemain Terpencet", Toast.LENGTH_SHORT).show()
            bundle.putString("pilihanUser","saya 1")
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        imgVsCom.setOnClickListener{
            Toast.makeText(this, "Vs Com Terpencet", Toast.LENGTH_SHORT).show()
            bundle.putString("pilihanUser","saya 2")
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
    }
}


