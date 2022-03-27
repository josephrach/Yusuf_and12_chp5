package com.example.game_suit_chp4

class GameSuit () : Game(){
    var answer = Jawaban()
    var ck:Int = 0
    var lors: String = ""

    override fun play(){
        var jawaban:String = ""
        var jw: Int = 1

        while (jw == 1) {
            println("Masukan pilihan (batu, gunting, kertas)")
            jawaban = readln()

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