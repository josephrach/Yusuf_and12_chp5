package com.example.game_suit_chp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.example.game_suit_chp4.databinding.ActivityMainBinding
import com.example.game_suit_chp4.fragment.SplashScreen

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        attachSplashFragment()
    }

    private fun attachSplashFragment(){
        val splashFragment = SplashScreen()
        val container = R.id.splash_fragment
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(container,splashFragment)
        fragmentTransaction.commit()
    }

}