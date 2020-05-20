package com.atriple.study.celestial_objects.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atriple.study.celestial_objects.R
import com.atriple.study.celestial_objects.model.CelestialObject
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCelestialObjectAdapter(private val listCelestialObject: List<CelestialObject>) :
    RecyclerView.Adapter<ListCelestialObjectAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvType: TextView = itemView.findViewById(R.id.tv_item_type)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_celestial_object, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCelestialObject.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val celestialObject = listCelestialObject[position]

        Glide.with(holder.itemView.context)
            .load(celestialObject.image)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = celestialObject.name
        holder.tvType.text = celestialObject.type
        holder.tvLocation.text = celestialObject.location
    }
}