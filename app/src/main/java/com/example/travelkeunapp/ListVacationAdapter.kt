package com.example.travelkeunapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListVacationAdapter(private val listVacation: ArrayList<Vacation>) : RecyclerView.Adapter<ListVacationAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_vacation, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val vacation = listVacation[position]

        Glide.with(holder.itemView.context)
            .load(vacation.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.placeImage)
        holder.placeName.text = vacation.name
        holder.placeDesc.text = vacation.description
    }

    override fun getItemCount(): Int {
        return listVacation.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var placeImage : ImageView = itemView.findViewById(R.id.img_item_photo)
        var placeName : TextView = itemView.findViewById(R.id.tv_item_name)
        var placeDesc : TextView = itemView.findViewById(R.id.tv_item_desc)
    }
}