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

        val imgVsPemain = findViewById<View>(R.id.img_menu_vspemain)
        val imgVsCom = findViewById<View>(R.id.img_menu_vscom)

        val halamanIntent = Intent(this, GameUtamaActivity::class.java)

        imgVsPemain.setOnClickListener{
            Toast.makeText(this, "Vs Pemain Terpencet", Toast.LENGTH_SHORT).show()
            halamanIntent.putExtra("pilihanUser1",1)
            println("kepanggilnih1")
            startActivity(halamanIntent)
        }
        imgVsCom.setOnClickListener{
            Toast.makeText(this, "Vs Com Terpencet", Toast.LENGTH_SHORT).show()
            halamanIntent.putExtra("pilihanUser2",2)
            println("kepanggilnih2")
            startActivity(halamanIntent)
        }
    }
}


