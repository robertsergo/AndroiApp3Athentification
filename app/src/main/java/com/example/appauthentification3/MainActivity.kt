package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val connecte = findViewById<Button>(R.id.connecter)
        val courriel = findViewById<EditText>(R.id.courriel)
        val motDePasse = findViewById<EditText>(R.id.motdepasse)

        val motDePasseValide = "12345"
        val courrielValide = "robert@gmail.com"


        connecte.setOnClickListener{
           // Toast.makeText(this, "vous avez cliqué sur conneter", Toast.LENGTH_LONG).show()
            val courrielEntree= courriel.text.toString()
            val motDePasseEntree = motDePasse.text.toString()
            if(courrielEntree.trim().isEmpty() || motDePasseEntree.trim().isEmpty()){
                Toast.makeText(this, "les champs doivent etre remplis convenablement", Toast.LENGTH_LONG).show()
            }else if(courrielEntree.trim() != courrielValide || motDePasseEntree.trim() != motDePasseValide){
            Toast.makeText(this, "user name ou mot de passe incorrect!!!", Toast.LENGTH_LONG).show()
        }else if(courrielEntree.trim() == courrielValide && motDePasseEntree.trim() == motDePasseValide){
                Toast.makeText(this, "Bienvenue $courrielEntree", Toast.LENGTH_LONG).show()
            }



        }
    }
}