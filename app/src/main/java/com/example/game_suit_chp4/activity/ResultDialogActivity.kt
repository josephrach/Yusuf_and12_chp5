package com.example.game_suit_chp4.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding
import com.example.game_suit_chp4.fragment.ResultDialogFragment

class ResultDialogActivity() : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle2 = intent.extras
        val pemenang = bundle2?.getString("pemenang")
        val teksStatus = findViewById<TextView>(R.id.txt_status_hasil)
        val vsPemain = R.id.img_aktiveBatuP1

        when(pemenang){
            "seri" -> teksStatus.setText(R.string.status_seri)
            "p1" -> teksStatus.setText(R.string.status_p1_menang)
            "com" -> teksStatus.setText(R.string.status_p2_menang)
        }

        setDialogListener()


    }
    
    private fun setDialogListener(){
        val btnMainLagi = findViewById<Button>(R.id.btn_mainlagi)
        val btnMenu = findViewById<Button>(R.id.btn_balikmenu)
        
        val toGameIntent = Intent(this,GameUtamaActivity::class.java)
        val toMenuIntent = Intent(this, HalamanMenuActivity::class.java)
        
        btnMainLagi.setOnClickListener{
            this.onStop()
            startActivity(toGameIntent)
        }
        btnMenu.setOnClickListener{
            this.onStop()
            startActivity(toMenuIntent)
        }
    }

}