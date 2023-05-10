package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PostDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_details2)

        val tvTitre = findViewById<TextView>(R.id.tvTitre)
        val titre = intent.getStringExtra("titre")
        tvTitre.text = titre
    }
}