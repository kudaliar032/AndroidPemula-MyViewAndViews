package com.tepuntal.myviewandviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Google Pixel"
        }
    }
}
