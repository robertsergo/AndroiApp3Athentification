package com.example.appauthentification3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class PostAdapter(
    var monContext: Context,
    var ressource: Int,
    var values: ArrayList<Post>
):ArrayAdapter<Post>(monContext, ressource, values) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val post = values[position]
        val itemView = LayoutInflater.from(monContext).inflate(ressource, parent, false)
        val tvTitre = itemView.findViewById<TextView>(R.id.tvTitre)
        val tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
        val imagePost = itemView.findViewById<ImageView>(R.id.imagePost)
        tvTitre.text = post.titre
        tvDescription.text = post.description
        imagePost.setImageResource(post.image)


        return itemView
    }
}