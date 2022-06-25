package com.example.travelkeunapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        assert(
            supportActionBar != null
        )
        title = "About Me";
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}