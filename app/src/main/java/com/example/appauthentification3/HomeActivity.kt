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
        val postsArray = listOf("post 6, post 7, post 8, post 9, post 10, post 11")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, postsArray)
        listePost.adapter = adapter




    }
}