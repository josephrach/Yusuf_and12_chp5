package com.example.game_suit_chp4.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.game_suit_chp4.R

class GameUtamaActivity : AppCompatActivity() {
    private val bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_game_utama)

        val bundle = intent.extras
        val pilihanUser = bundle?.getString("pilihanUser")
//        val pilihanUser2 = bundle?.getInt("pilihanMenu2")
//        val hasilJumlah = pilihanUser1?.plus(pilihanUser2!!)
//        print(pilihanUser)
//        Toast.makeText(this, "${pilihanUser}", Toast.LENGTH_SHORT).show()

        when(pilihanUser){
            "saya 1" -> vsPemain()
            "saya 2" -> vsComputer()
            else -> Toast.makeText(this, "ini error", Toast.LENGTH_SHORT).show()
        }

        val jawabann :String

    }

    private fun vsPemain() {
        val dataJawaban = mutableListOf("batu","gunting","kertas")
        var pilihanU = bundle?.getString("pilihanUser")
        var comJawab = dataJawaban.random()
        println(comJawab)

        var jawaban :String
        val batuP = findViewById<View>(R.id.img_batuP1)
        val guntingP = findViewById<View>(R.id.img_guntingP1)
        val kertasP = findViewById<View>(R.id.img_kertasP1)
        val batuC = findViewById<View>(R.id.img_batuCom)
        val guntingC = findViewById<View>(R.id.img_guntingCom)
        val kertasC = findViewById<View>(R.id.img_kertasCom)

        val batuPaktif = findViewById<View>(R.id.img_aktiveBatuP1)
        val guntingPaktif = findViewById<View>(R.id.img_activeGuntingP1)
        val kertasPaktif = findViewById<View>(R.id.img_activeKertasP1)
        val batuCaktif = findViewById<View>(R.id.img_aktiveBatuCom)
        val guntingCaktif = findViewById<View>(R.id.img_activeGuntingCom)
        val kertasCaktif = findViewById<View>(R.id.img_activeKertasCom)




        val halamanIntent = Intent(this, ResultDialogActivity::class.java)

        batuP.setOnClickListener() {
//            jawaban ="batuP"
            batuPaktif.isVisible = true
            when(comJawab){
                "batu" -> {
                    bundle.putString("pemenang","seri")
                    batuCaktif.isVisible = true
                }
                "kertas" ->{
                    bundle.putString("pemenang","com")
                    kertasCaktif.isVisible = true
                }
                "gunting" -> bundle.putString("pemenang","p1")
                else -> onRestart()
            }
            halamanIntent.putExtras(bundle)
            Toast.makeText(this, "kamu memilih ${pilihanU} dan lawan pilih ${comJawab}", Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(halamanIntent)
            }, 1000)
        }
        guntingP.setOnClickListener() {
            jawaban ="guntingP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","com")
                "kertas" -> bundle.putString("pemenang","p1")
                "gunting" -> bundle.putString("pemenang","seri")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        kertasP.setOnClickListener() {
            jawaban ="kertasP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","p1")
                "kertas" -> bundle.putString("pemenang","seri")
                "gunting" -> bundle.putString("pemenang","com")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        batuC.setOnClickListener() {
            jawaban ="batuP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","seri")
                "kertas" -> bundle.putString("pemenang","p1")
                "gunting" -> bundle.putString("pemenang","com")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        guntingC.setOnClickListener() {
            jawaban ="guntingP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","p1")
                "kertas" -> bundle.putString("pemenang","com")
                "gunting" -> bundle.putString("pemenang","seri")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        kertasC.setOnClickListener() {
            jawaban ="kertasP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","com")
                "kertas" -> bundle.putString("pemenang","seri")
                "gunting" -> bundle.putString("pemenang","p1")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }

    }

    private fun vsComputer() {
        val dataJawaban = mutableListOf("batu","gunting","kertas")
        val comJawab = dataJawaban.random()
        var jawaban :String
        val batuP = findViewById<View>(R.id.img_batuP1)
        val guntingP = findViewById<View>(R.id.img_guntingP1)
        val kertasP = findViewById<View>(R.id.img_kertasP1)

        val halamanIntent = Intent(this, ResultDialogActivity::class.java)

        batuP.setOnClickListener() {
            jawaban ="batuP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","seri")
                "kertas" -> bundle.putString("pemenang","com")
                "gunting" -> bundle.putString("pemenang","p1")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        guntingP.setOnClickListener() {
            jawaban ="guntingP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","com")
                "kertas" -> bundle.putString("pemenang","p1")
                "gunting" -> bundle.putString("pemenang","seri")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }
        kertasP.setOnClickListener() {
            jawaban ="kertasP"
            when(comJawab){
                "batu" -> bundle.putString("pemenang","p1")
                "kertas" -> bundle.putString("pemenang","seri")
                "gunting" -> bundle.putString("pemenang","com")
            }
            halamanIntent.putExtras(bundle)
            startActivity(halamanIntent)
        }

    }

}
