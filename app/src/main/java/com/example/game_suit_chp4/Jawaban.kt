package com.example.game_suit_chp4

class Jawaban {
    val dataJawaban = mutableListOf("Batu","Gunting","Kertas")
    var comChoice: String = ""

    fun pilihBatu(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "Batu"-> println("DRAW")
            "Guntin"-> println("WIN")
            "Kertas"-> println("LOSE")
        }
    }
    fun pilihGunting(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "Batu"-> println("LOSE")
            "Guntin"-> println("DRAW")
            "Kertas"-> println("WIN")
        }
    }
    fun pilihKertas(){
        println("COM memilih ${comChoice}")
        when(comChoice){
            "Batu"-> println("WIN")
            "Guntin"-> println("LOSE")
            "Kertas"-> println("DRAW")
        }
    }
    fun invalid(){
        println("kamu salah memasukan jawaban")
    }
}