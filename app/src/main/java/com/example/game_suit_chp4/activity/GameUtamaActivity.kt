package com.example.game_suit_chp4.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding
import com.example.game_suit_chp4.databinding.DialogFragmentResultBinding

class GameUtamaActivity : AppCompatActivity() {
    private val bundle = Bundle()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_game_utama)

        val bundle = intent.extras
        val pilihanUser = bundle?.getString("pilihanUser")
//        val pilihanUser2 = bundle?.getInt("pilihanMenu2")
//        val hasilJumlah = pilihanUser1?.plus(pilihanUser2!!)
//        print(pilihanUser)
//        Toast.makeText(this, "${pilihanUser}", Toast.LENGTH_SHORT).show()

        refresh()
        when(pilihanUser){
            "saya 1" -> vsPemain()
            "saya 2" -> vsComputer()
        }

        val jawabann :String

    }

    private fun vsPemain() {
        val dataJawaban = mutableListOf("batu","gunting","kertas")
        var pilihanU = bundle?.getString("pilihanUser")
        var comJawab = dataJawaban.random()

        val dialogView = LayoutInflater.from(this)
            .inflate(R.layout.dialog_fragment_result,null,false)

        val dialogViewBinding = DialogFragmentResultBinding.bind(dialogView)
        val dialogCustomLayoutBinder = AlertDialog.Builder(this).setView(dialogViewBinding.root)

        val dialogCustomLayout = dialogCustomLayoutBinder.create()

        val halamanIntent = Intent(this, ResultDialogActivity::class.java)

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


        batuP.setOnClickListener() {
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
                "gunting" -> {
                    bundle.putString("pemenang","p1")
                    guntingCaktif.isVisible = true
                }
            }
            halamanIntent.putExtras(bundle)
            Handler(Looper.getMainLooper()).postDelayed({
                this.onPause()
//                startActivity(halamanIntent)
                dialogCustomLayout.show()
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

    private fun vsComputer() {}

    private fun refresh(){

        val refresh = findViewById<View>(R.id.img_tombolRefresh)

        refresh.setOnClickListener() {
            this.onRestart()
        }
    }

    private fun showDialog(){

    }
}


