package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connecte = findViewById<Button>(R.id.connecter)
        connecte.setOnClikListener{
            Toast.makeText(this, "vous avez cliqué sur conneter", Toast.LENGTH_LONG)
        }
    }
}