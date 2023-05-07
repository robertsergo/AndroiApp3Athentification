package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //1-recuper la variable
        val courriel = intent.getStringExtra("email")
        val listePost = findViewById<ListView>(R.id.listepost)
        val postsArray = arrayListOf("post 1, post 2, post 3, post 4")
        val adapter = PostAdapter(this, R.layout.item_post, postsArray)
        listePost.adapter = adapter




    }
}