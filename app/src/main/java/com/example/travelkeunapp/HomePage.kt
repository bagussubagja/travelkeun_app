package com.example.travelkeunapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomePage : AppCompatActivity() {
    companion object{
        const val EXTRA_USERNAME = "username"

    }
    private lateinit var rvVacation : RecyclerView
    private var list: ArrayList<Vacation> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val username_receiver: TextView = findViewById(R.id.username_receiver)
        val username = intent.getStringExtra(EXTRA_USERNAME)
        username_receiver.text = username
        rvVacation = findViewById(R.id.rv_vacation)
        rvVacation.setHasFixedSize(true)
        list.addAll(VacationPlaceData.listData)
        showRecyclerCardView()
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_about_me -> {
                val intent = Intent(this@HomePage, AboutMe::class.java)
                startActivity(intent)
            }

            R.id.action_cardview -> {
        showRecyclerCardView()
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun showRecyclerList(){
        rvVacation.layoutManager = LinearLayoutManager(this)
        val listVacationAdapter = ListVacationAdapter(list)
        rvVacation.adapter = listVacationAdapter
    }
    private fun showRecyclerGrid() {
        rvVacation.layoutManager = GridLayoutManager(this, 2)
        val gridVacationAdapter = GridVacationAdapter(list)
        rvVacation.adapter = gridVacationAdapter
    }
    private fun showRecyclerCardView() {
        rvVacation.layoutManager = LinearLayoutManager(this)
        val cardViewVacationAdapter = CardViewVacationAdapter(list)
        rvVacation.adapter = cardViewVacationAdapter
    }
}