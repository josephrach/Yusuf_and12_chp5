package com.example.game_suit_chp4

import com.example.game_suit_chp4.databinding.ActivityMainBinding

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