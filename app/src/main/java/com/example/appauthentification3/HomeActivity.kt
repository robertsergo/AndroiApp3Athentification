package com.example.appauthentification3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //1-recuper la variable
        val courriel = intent.getStringExtra("email")
        val listePosts = findViewById<ListView>(R.id.listeposts)
        val postsArray = arrayListOf(
            Post("Post 1", "Une description 1 du post 1 qui va etre afficher ici qui ne vaut rien dire ...", R.drawable.toyotachr),
            Post( "Post 2", "Une description 2 du post 2 qui va etre afficher ici qui ne vaut rien dire ...", R.drawable.image2),
            Post("Post 3", "Une description 3 du post 3 qui va etre afficher ici qui ne vaut rien dire ...", R.drawable.image3),
            Post("Post 4", "Une description 4 du post 4 qui va etre afficher ici qui ne vaut rien dire ...", R.drawable.image4),
            Post("Post 5", "Une description 5 du post 5 qui va etre afficher ici qui ne vaut rien dire ...", R.drawable.image5)
        )
        val adapter = PostAdapter(this, R.layout.item_post, postsArray)


        listePosts.adapter = adapter

        listePosts.setOnItemClickListener{ adapterView, view, position, id ->
            Toast.makeText(this, "position: $position", Toast.LENGTH_LONG).show()
        }




    }
}