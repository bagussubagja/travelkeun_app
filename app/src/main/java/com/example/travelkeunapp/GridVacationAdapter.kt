package com.example.travelkeunapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridVacationAdapter(val listVacation : ArrayList<Vacation>) : RecyclerView.Adapter<GridVacationAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_vacation, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listVacation[position].image)
            .apply(RequestOptions().override(350,350))
            .into(holder.placeImages)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class GridViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var placeImages : ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}