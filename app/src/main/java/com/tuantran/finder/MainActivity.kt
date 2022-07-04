package com.tuantran.finder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tuantran.finder.fragment.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)
         val homeFragment = HomeFragment()
         val favoriteFragment = FavoriteFragment()
         val chatFragment = ChatFragment()
         val profileFragment = ProfileFragment()
    val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottom_navi)
        setThatFragment(homeFragment)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> setThatFragment(homeFragment)
                R.id.menu_tim -> setThatFragment(favoriteFragment)
                R.id.menu_chat -> setThatFragment(chatFragment)
                R.id.menu_profile -> setThatFragment(profileFragment)
            }
            true
        }


    }
    private fun setThatFragment(fragment : Fragment) {
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment,fragment)
            transaction.commit()
        }
    }

}