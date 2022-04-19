package com.example.game_suit_chp4.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import androidx.viewpager.widget.ViewPager
import com.example.game_suit_chp4.R
import com.example.game_suit_chp4.adapter.SliderManagerAdapter
import com.example.game_suit_chp4.fragment.LandingPageFragment1
import com.example.game_suit_chp4.fragment.LandingPageFragment2
import com.example.game_suit_chp4.fragment.LandingPageFragment3


//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        setupViewPager()
//        attachSplashFragment()
    }

    private fun setupViewPager(){
        val vpSlider : ViewPager = findViewById(R.id.vp_slider)
        val vpAdapter = SliderManagerAdapter(supportFragmentManager)

        val lp1 = LandingPageFragment1()
        val lp2 = LandingPageFragment2()
        val lp3 = LandingPageFragment3()
        val fragmentList = listOf(
            lp1,lp2,lp3
        )
        vpAdapter.addFragmentList(fragmentList)
        vpSlider.adapter = vpAdapter
    }

//    private fun attachSplashFragment(){
//        val splashFragment = SplashScreen()
//        val container = R.id.splash_fragment
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.add(container,splashFragment)
//        fragmentTransaction.commit()
//    }
}