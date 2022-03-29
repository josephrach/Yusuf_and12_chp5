package com.example.game_suit_chp4

import android.content.Context
import com.example.game_suit_chp4.databinding.ActivityMainBinding

class EventHendler(private var context: Context) {
    lateinit var binding: ActivityMainBinding

    fun onRefreshClick(){
        binding.gameStatus.text = "taiii"
    }

}