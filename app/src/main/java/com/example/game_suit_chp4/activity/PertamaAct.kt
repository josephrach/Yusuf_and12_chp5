package com.example.game_suit_chp4.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.game_suit_chp4.AmbilAksi
import com.example.game_suit_chp4.Game
import com.example.game_suit_chp4.GameSuit
import com.example.game_suit_chp4.Jawaban
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding

class PertamaAct : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var game = GameSuit()
        game.play()
    }

    }


//        DISINI ADA LOGIC UTAMA

class AmbilAksi {
    lateinit var binding: ActivityMainBinding
    var pilihan : Int = 0
    var chs : String =""
    var batuPak = binding.batuP1
    var guntingPak = binding.guntingP1
    var kertasPak = binding.kertasP1
    var statusPak = binding.gameStatus

    fun checkView(){
        when(batuPak.isClickable){
            true -> pilihan = 1
            else -> pilihan = 0
        }
        when(guntingPak.isClickable){
            true -> pilihan = 2
            else -> pilihan = 0
        }
        when(kertasPak.isClickable){
            true -> pilihan = 3
            else -> pilihan = 0
        }

        when(pilihan){
            1 -> chs = "batu"
            2 -> chs = "gunting"
            3 -> chs = "kertas"
        }
    }

}


abstract class Game() {
    abstract fun play()

}

class GameSuit () : Game(){
    var answer = Jawaban()
    var ambilaksi = AmbilAksi()
    var ck:Int = 0
    var lors: String = ""
    lateinit var binding :ActivityMainBinding


    override fun play(){
        ambilaksi.checkView()

        var jawaban:String = ambilaksi.chs
        var jw: Int = 1


        while (jw == 1) {
            println("Masukan pilihan (batu, gunting, kertas)")

            when (jawaban) {
                "batu" -> {
                    answer.pilihBatu()
                    jw = 0
                }
                "gunting" -> {
                    answer.pilihGunting()
                    jw = 0
                }
                "kertas" -> {
                    answer.pilihKertas()
                    jw = 0
                }
                else -> jw = 1
            }
        }
    }

    fun lanjut(){
        var jk:Int = 1
        var iter: Int = 0

        while (jk == 1) {
            println("Jika mau lanjut main ketik (lanjut) jika tidak ketik (selesai)")
            lors = readln()
            when (lors) {
                "selesai" -> {
                    jk = 0
                    ck = 1
                }
                "lanjut" -> {
                    jk = 0
                    ck = 0
                }
                else -> iter + 1
            }
        }
    }
}

class Jawaban {
    lateinit var binding: ActivityMainBinding
    val dataJawaban = mutableListOf("batu","gunting","kertas")
    var comChoice: String = ""

    var batuP1 = binding.batuP1
    var guntingP1 = binding.guntingP1
    var kertasP1 = binding.kertasP1

    var batuCom = binding.batuCom
    var guntingCom = binding.guntingCom
    var kertasCom = binding.kertasCom

    var gameStatus = binding.gameStatus

    fun pilihBatu(){
        binding.aktiveBatuP1.isVisible
        when(comChoice){
            "batu"-> {
                binding.aktiveBatuCom.isVisible
                binding.gameStatus.setText("@strings.draw")
            }
            "gunting"-> {
                binding.aktiveBatuP1.isVisible
                binding.gameStatus.setText("@strings.pemain1_menang")
            }
            "kertas"-> {
                binding.aktiveBatuP1.isVisible
                binding.gameStatus.setText("@strings.com_menang")
            }
        }
    }
    fun pilihGunting(){
        binding.activeGuntingP1.isVisible
        when(comChoice){
            "batu"-> {
                binding.gameStatus.setText("@strings.com_menang")
                binding.batuCom.isVisible
            }
            "gunting"-> {
                binding.gameStatus.setText("@strings.draw")
                binding.activeGuntingCom.isVisible
            }
            "kertas"-> {
                binding.gameStatus.setText("@strings.pemain1_menang")
                binding.kertasCom.isVisible
            }
        }
    }
    fun pilihKertas(){
        binding.activeKertasP1.isVisible
        when(comChoice){
            "batu"-> {
                binding.gameStatus.setText("@strings.pemain1_menang")
                binding.aktiveBatuCom.isVisible
            }
            "gunting"-> {
                binding.gameStatus.setText("@strings.computer_menang")
                binding.activeGuntingCom.isVisible
            }
            "kertas"-> {
                binding.gameStatus.setText("@string.draw")
                binding.activeKertasCom.isVisible
            }
        }
    }
}




//        AKHIR DARI LOGIC UTAMA