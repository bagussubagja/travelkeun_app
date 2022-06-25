package com.example.travelkeunapp

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewVacationAdapter(private val listVacation : ArrayList<Vacation>) : RecyclerView.Adapter<CardViewVacationAdapter.CardViewViewHolder>() {
    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_vacation, parent, false)
    return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val vacation = listVacation[position]
        Glide.with(holder.itemView.context)
            .load(vacation.image)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)
        holder.tvName.text = vacation.name
        holder.tvDetail.text = vacation.description
holder.btnDetail.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailPage::class.java)
            intent.putExtra(INTENT_PARCELABLE, vacation)
            startActivity(holder.itemView.context, intent, null)
        }
    }



    override fun getItemCount(): Int {
        return listVacation.size
    }

    inner class CardViewViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_desc)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }
    }


