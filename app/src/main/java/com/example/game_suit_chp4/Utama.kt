package com.example.game_suit_chp4

fun main(args: Array<String>) {
    val maen = GameSuit()

    while (maen.ck==0) {
        maen.answer.comChoice = maen.answer.dataJawaban.random()
        maen.play()

        when (maen.lors) {
            "selesai" -> maen.ck = 1
            "lanjut" -> maen.ck = 0
            else -> maen.answer.invalid()
        }
    }
}

