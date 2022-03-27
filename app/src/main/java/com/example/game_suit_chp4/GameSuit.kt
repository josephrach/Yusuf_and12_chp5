package com.example.game_suit_chp4

class GameSuit () : Game(){
    var answer = Jawaban()
    var ck:Int = 0
    var lors: String = ""

    override fun play(){
        println("Masukan pilihan (Batu, Gunting, Kertas)")
        var jawaban:String = readln()

        when(jawaban){
         "Batu" -> answer.pilihBatu()
         "Gunting" -> answer.pilihGunting()
         "Kertas" -> answer.pilihKertas()
         else -> answer.invalid()
        }

        println("Jika mau lanjut main ketik (lanjut) jika tidak ketik (selesai)")
        lors = readln()

    }
}