package com.example.game_suit_chp4

class Jawaban {
    val dataJawaban = mutableListOf("batu","gunting","kertas")
    var comChoice: String = ""

    fun pilihBatu(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "batu"-> println("DRAW")
            "gunting"-> println("WIN")
            "kertas"-> println("LOSE")
        }
    }
    fun pilihGunting(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "batu"-> println("LOSE")
            "gunting"-> println("DRAW")
            "kertas"-> println("WIN")
        }
    }
    fun pilihKertas(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "batu"-> println("WIN")
            "gunting"-> println("LOSE")
            "kertas"-> println("DRAW")
        }
    }
}