package com.tuantran.finder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tuantran.finder.fragment.*
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        btnLoginGG.setOnClickListener {
//        val homeFragment = HomeFragment()
//            val fragment : Fragment?=
//
//            supportFragmentManager.findFragmentByTag(HomeFragment ::class.java.simpleName)
//
//            if (fragment !is HomeFragment){
//            supportFragmentManager.beginTransaction()
//                .add(R.id.LinerFragment,homeFragment,HomeFragment::class.java.simpleName)
//                .commit()
//            }

            val intent : Intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }


    }


}