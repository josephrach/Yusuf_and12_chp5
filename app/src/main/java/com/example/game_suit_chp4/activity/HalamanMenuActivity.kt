package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
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
        val txtVsPemain = findViewById<TextView>(R.id.txt_menu_vspemain)
        val txtVsCom = findViewById<TextView>(R.id.txt_menu_vscom)
        val paket = intent.extras
        val namaUser = paket?.getString("namaUser")

        txtVsPemain.setText("${namaUser} vs Pemain 2")
        txtVsCom.setText("${namaUser} vs Computer")

        val imgVsPemain = findViewById<View>(R.id.img_menu_vspemain)
        val imgVsCom = findViewById<View>(R.id.img_menu_vscom)

        val halamanIntent = Intent(this, GameUtamaActivity::class.java)

        imgVsPemain.setOnClickListener{
            Toast.makeText(this, "Main dengan Pemain 2", Toast.LENGTH_SHORT).show()
            bundle.putString("pilihanUser","saya 1")
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        imgVsCom.setOnClickListener{
            Toast.makeText(this, "Main dengan komputer", Toast.LENGTH_SHORT).show()
            bundle.putString("pilihanUser","saya 2")
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
    }
}


