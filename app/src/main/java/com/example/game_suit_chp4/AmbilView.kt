package com.example.game_suit_chp4

import android.widget.ImageView
import com.example.game_suit_chp4.databinding.ActivityMainBinding

class AmbilView() {
    lateinit var binding: ActivityMainBinding
    var batuP1 = binding.batuP1
    var guntingP1 = binding.guntingP1
    var kertasP1 = binding.kertasP1
    var statusBar = binding.gameStatus

    fun setListenerBatu () {
        batuP1.setOnClickListener()
//        statusBar.setText(R.values.string.com_menang)
    }
}

private fun ImageView.setOnClickListener() {

}
