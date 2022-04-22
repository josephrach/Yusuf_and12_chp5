package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.fragment.LandingPageFragment1
import com.example.game_suit_chp4.fragment.LandingPageFragment3

class LandingPageActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_landing_page3)
        val lp3Indtent = Intent(this, HalamanMenuActivity::class.java)
        val teksInput = findViewById<EditText>(R.id.input_nama_lp3)
        val bundle = Bundle()

        val btnLanjut = findViewById<Button>(R.id.btn_lp3_lanjut)
        btnLanjut.setOnClickListener{
            var namaUser = teksInput.getText().toString()
            bundle.putString("namaUser",namaUser)
            lp3Indtent.putExtras(bundle)
            startActivity(lp3Indtent)
        }

    }
}