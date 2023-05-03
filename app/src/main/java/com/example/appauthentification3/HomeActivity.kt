package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val tvHello = findViewById<TextView>(R.id.hello)

        //1-recuper la variable
        var courriel = intent.getStringExtra("email")

        //2-afficher la variable

        tvHello.text = "bienvenue: $courriel"
    }
}