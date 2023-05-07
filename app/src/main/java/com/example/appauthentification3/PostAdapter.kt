package com.example.appauthentification3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PostAdapter(
    var monContext: Context,
    var ressource: Int,
    var values: ArrayList<String>
):ArrayAdapter<String>(monContext, ressource, values) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val post = values[position]
        val itemView = LayoutInflater.from(monContext).inflate(ressource, parent, false)
        val tvTitre = itemView.findViewById<TextView>(R.id.tvTitre)
        tvTitre.text = post

        return itemView
    }
}