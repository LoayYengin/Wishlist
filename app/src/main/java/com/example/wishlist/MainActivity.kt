package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var wishes: List<Wish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val wishesRv = findViewById<RecyclerView>(R.id.wishesRv)

        // Fetch the list of emails
        wishes = WishFetcher.getWishes()

        // Create adapter passing in the list of emails
        val adapter = WishAdapter(wishes)

        // Attach the adapter to the RecyclerView to populate items
        wishesRv.adapter = adapter

        // Set layout manager to position the items
        wishesRv.layoutManager = LinearLayoutManager(this)
    }
}