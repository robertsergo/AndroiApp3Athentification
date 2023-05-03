package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val connecte = findViewById<Button>(R.id.connecter)
        val courriel = findViewById<EditText>(R.id.courriel)
        val motDePasse = findViewById<EditText>(R.id.motdepasse)
        val er = findViewById<TextView>(R.id.erreur)


        val motDePasseValide = "1234"
        val courrielValide = "robert@gmail.com"


        connecte.setOnClickListener{
            er.visibility = View.GONE
           // Toast.makeText(this, "vous avez cliqué sur conneter", Toast.LENGTH_LONG).show()
            val courrielEntree= courriel.text.toString()
            val motDePasseEntree = motDePasse.text.toString()
            if(courrielEntree.trim().isEmpty() || motDePasseEntree.trim().isEmpty()){
                er.text = "les champs doivent etre remplis convenablement"
                er.visibility = View.VISIBLE
                //Toast.makeText(this, "les champs doivent etre remplis convenablement", Toast.LENGTH_LONG).show()
            }else if(courrielEntree.trim() != courrielValide || motDePasseEntree.trim() != motDePasseValide){
                er.text = "les champs doivent etre remplis convenablement"
                er.visibility = View.VISIBLE
           // Toast.makeText(this, "user name ou mot de passe incorrect!!!", Toast.LENGTH_LONG).show()
        }else if(courrielEntree.trim() == courrielValide && motDePasseEntree.trim() == motDePasseValide){
                Toast.makeText(this, "Bienvenue $courrielEntree", Toast.LENGTH_LONG).show()
            }



        }
    }
}