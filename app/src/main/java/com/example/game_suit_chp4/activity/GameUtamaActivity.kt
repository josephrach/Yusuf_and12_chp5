package com.example.game_suit_chp4.activity

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding
import com.example.game_suit_chp4.databinding.DialogFragmentResultBinding
import com.example.game_suit_chp4.logic.Game

class GameUtamaActivity : AppCompatActivity() {

    val bundle = Bundle()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_game_utama)
        Toast.makeText(this, "ini game utama", Toast.LENGTH_SHORT).show()

        val bundle1 = intent.extras
        val pilihanUser = bundle1?.getString("pilihanUser")
        val namaUser = bundle1?.getString("namaUser")
        val namePemain1 = findViewById<TextView>(R.id.txt_pemain1)
        namePemain1.setText(namaUser)

        refresh()
        when(pilihanUser){
            "saya 1" -> BvsPemain()
            "saya 2" -> BvsComputer()
        }

        val jawabann :String

    }

    fun BvsPemain(){
        val bundle1 = intent.extras
        val namaUser = bundle1?.getString("namaUser")
        val namePemain2 = findViewById<TextView>(R.id.txt_pemain2)
        namePemain2.setText("Pemain 2")

        var seri : String = "SERI!"
        var pemain1Menang : String = "${namaUser} MENANG!"
        var pemain2Menang : String = "Pemain 2 MENANG!"
        var computerMenang : String = "Computer MENANG!"

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

        var jawabanP1: String = ""
        var jawabanP2: String = ""

        batuP.setOnClickListener{
            batuPaktif.isVisible = true
            jawabanP1 = "batu"
        }
        guntingP.setOnClickListener{
            guntingPaktif.isVisible = true
            jawabanP1 = "gunting"
        }
        kertasP.setOnClickListener{
            kertasPaktif.isVisible = true
            jawabanP1 = "kertas"
        }

        var d = AlertDialog.Builder(this)
        d.setTitle("Hasil Permainan")
        d.setPositiveButton("Main Lagi",{dialog:DialogInterface?,which: Int -> var i = Intent(this,GameUtamaActivity::class.java)})
        d.setNegativeButton("Kembali ke Halaman Menu",{dialog:DialogInterface?,which: Int -> var i = Intent(this,HalamanMenuActivity::class.java)})

        fun showDialogResult(jawabanp1:String, jawabanp2:String,seri:String,pemain1menang:String,pemain2menang:String,computermenang:String){
            var jawabanP1 = jawabanp1
            var jawabanP2 = jawabanp2
            var seri = seri
            var pemain1Menang = pemain1menang
            var pemain2Menang = pemain2menang
            var computerMenang = computermenang

            when(jawabanP1){
                "batu" ->{
                    when(jawabanP2){
                        "batu" -> {
                            d.setMessage(seri)
                        }
                        "gunting" -> {
                            d.setMessage(pemain1Menang)
                        }
                        "kertas" -> {
                            d.setMessage(pemain2Menang)
                        }
                    }
                }
                "gunting" ->{
                    when(jawabanP2){
                        "batu" -> {
                            d.setMessage(pemain2Menang)
                        }
                        "gunting" -> {
                            d.setMessage(seri)
                        }
                        "kertas" -> {
                            d.setMessage(pemain1Menang)
                        }
                    }
                }
                "kertas" ->{
                    when(jawabanP2){
                        "batu" -> {
                            d.setMessage(pemain1Menang)
                        }
                        "gunting" -> {
                            d.setMessage(pemain2Menang)
                        }
                        "kertas" -> {
                            d.setMessage(seri)
                        }
                    }
                }
            }

        }

        batuC.setOnClickListener{
            batuCaktif.isVisible = true
            jawabanP2 = "batu"
            showDialogResult(jawabanP1,jawabanP2,seri,pemain1Menang,pemain2Menang,computerMenang)
            d.show()
        }
        guntingC.setOnClickListener{
            guntingCaktif.isVisible = true
            jawabanP2 = "gunting"
            showDialogResult(jawabanP1,jawabanP2,seri,pemain1Menang,pemain2Menang,computerMenang)
            d.show()
        }
        kertasC.setOnClickListener{
            kertasCaktif.isVisible = true
            jawabanP2 = "kertas"
            showDialogResult(jawabanP1,jawabanP2,seri,pemain1Menang,pemain2Menang,computerMenang)
            d.show()
        }


    }


    fun BvsComputer(){
        val dataJawaban = mutableListOf("batu","gunting","kertas")
        var pilihanU = bundle?.getString("pilihanUser")
        var comJawab = dataJawaban.random()

        val bundle1 = intent.extras
        val namaUser = bundle1?.getString("namaUser")
        val namePemain2 = findViewById<TextView>(R.id.txt_pemain2)
        namePemain2.setText("COM")

        var seri : String = "SERI!"
        var pemain1Menang : String = "${namaUser} MENANG!"
        var pemain2Menang : String = "Pemain 2 MENANG!"
        var computerMenang : String = "Computer MENANG!"

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

        var d = AlertDialog.Builder(this)
        d.setTitle("Hasil Permainan")
        d.setPositiveButton("Main Lagi",{dialog:DialogInterface?,which: Int -> var i = Intent(this,GameUtamaActivity::class.java)})
        d.setNegativeButton("Kembali ke Halaman Menu",{dialog:DialogInterface?,which: Int -> var i = Intent(this,HalamanMenuActivity::class.java)})

        batuP.setOnClickListener {
            batuPaktif.isVisible = true

            when (comJawab) {
                "batu" -> {
                    batuCaktif.isVisible = true
                    d.setMessage(seri)
                }
                "kertas" -> {
                    kertasCaktif.isVisible = true
                    d.setMessage(computerMenang)
                }
                "gunting" -> {
                    guntingCaktif.isVisible = true
                    d.setMessage(pemain1Menang)
                }
            }
            d.show()
        }
        kertasP.setOnClickListener {
            kertasPaktif.isVisible = true

            when (comJawab) {
                "batu" -> {
                    batuCaktif.isVisible = true
                    d.setMessage(pemain1Menang)
                }
                "kertas" -> {
                    kertasCaktif.isVisible = true
                    d.setMessage(seri)
                }
                "gunting" -> {
                    guntingCaktif.isVisible = true
                    d.setMessage(computerMenang)
                }
            }
            d.show()
        }
        guntingP.setOnClickListener {
            guntingPaktif.isVisible = true

            when (comJawab) {
                "batu" -> {
                    batuCaktif.isVisible = true
                    d.setMessage(computerMenang)
                }
                "kertas" -> {
                    kertasCaktif.isVisible = true
                    d.setMessage(pemain1Menang)
                }
                "gunting" -> {
                    guntingCaktif.isVisible = true
                    d.setMessage(seri)
                }
            }
            d.show()
        }
    }


    fun vsPemain() {
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

    fun vsComputer() {}

    fun refresh(){

        val refresh = findViewById<View>(R.id.img_tombolRefresh)
        val refreshIntent = Intent(this,GameUtamaActivity::class.java)

        refresh.setOnClickListener() {
            super.onRestart()
        }
    }

    fun showDialog(){

    }
}



