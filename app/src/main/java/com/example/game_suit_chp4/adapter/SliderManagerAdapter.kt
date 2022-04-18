package com.example.game_suit_chp4.adapter

import android.view.LayoutInflater
import android.view.View
import androidx.core.view.LayoutInflaterCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.fragment.app.ListFragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
//import com.example.game_suit_chp4.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class SliderManagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val listFragment : List<Fragment> = emptyList()
//    lateinit var binding: ActivityMainBinding

    fun addFragmentList(fragments: List<Fragment>){
        val listFragment = fragments
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    override fun getCount(): Int {
        return listFragment.size
    }

}