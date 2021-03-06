package com.jeremyciske.rainassignment.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jeremyciske.rainassignment.R
import com.jeremyciske.rainassignment.fragment.ZipSearchFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container, ZipSearchFragment()).commit()
    }
}