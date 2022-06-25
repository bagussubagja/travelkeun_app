package com.example.travelkeunapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var userName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_getStarted : Button = findViewById(R.id.btn_getStarted)
        userName = findViewById(R.id.nameTextController)
        btn_getStarted.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_getStarted -> {
               if(userName.text.toString().isEmpty()) {
                   userName.error = "Please enter your name!"
               } else {
                   val moveIntent = Intent(this, HomePage::class.java)
                   moveIntent.putExtra(HomePage.EXTRA_USERNAME, userName.text.toString())
                   userName.text.clear()
                   startActivity(moveIntent)
               }
            }
        }
    }
}