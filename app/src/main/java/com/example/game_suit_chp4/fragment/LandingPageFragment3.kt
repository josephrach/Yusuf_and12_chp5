package com.example.game_suit_chp4.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.databinding.ActivityMainBinding

class LandingPageFragment3 : Fragment(R.layout.fragment_landing_page3) {
    lateinit var binding :ActivityMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

//        val textInput = binding.roo
    }
}