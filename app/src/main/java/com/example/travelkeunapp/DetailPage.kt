package com.example.travelkeunapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)
        val vacation =
            intent.getParcelableExtra<Vacation>(CardViewVacationAdapter.INTENT_PARCELABLE)
        val image = findViewById<ImageView>(R.id.imgFromId)
        val title = findViewById<TextView>(R.id.placeName)
        val description = findViewById<TextView>(R.id.placeDesc)

        image.setImageResource(vacation?.image!!)
        title.text = vacation.name
        description.text = vacation.description

        assert(
            supportActionBar != null
        )
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val btnBooking : Button = findViewById(R.id.btn_booking)
        btnBooking.setOnClickListener {
            finish()
            Toast.makeText(this, "Successful to book your trip, lets go Travelkeun!", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}

