package com.example.game_suit_chp4.lainnya

import com.example.game_suit_chp4.databinding.ActivityMainBinding

class GameSuit () : Game(){
    var answer = Jawaban()
    var ambilaksi = AmbilAksi()
    var ck:Int = 0
    var lors: String = ""
    lateinit var binding :ActivityMainBinding


    override fun play(){
//        ambilaksi.checkView()

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