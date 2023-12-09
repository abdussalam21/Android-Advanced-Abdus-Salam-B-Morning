package com.example.navigationdrawer.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdrawer.R

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<SocialMedia>()
        data.add(SocialMedia(R.drawable.facebook, "Abdus Salam", "Facebook"))
        data.add(SocialMedia(R.drawable.discord, "abdussalam2107", "Discord"))
        data.add(SocialMedia(R.drawable.gmail, "abdus7630@gmail.com", "Gmail"))
        data.add(SocialMedia(R.drawable.instagram, "abdus_488", "Instagram"))
        data.add(SocialMedia(R.drawable.nvidia, "Abdussalam095", "Nvidia"))
        data.add(SocialMedia(R.drawable.spotify, "Lam", "Spotify"))
        data.add(SocialMedia(R.drawable.steam, "silvialestari419", "Steam"))
        data.add(SocialMedia(R.drawable.tiktok, "salamvnza", "Tiktok"))
        data.add(SocialMedia(R.drawable.youtube, "Abdus Salam", "YouTube"))
        data.add(SocialMedia(R.drawable.linkedin, "Abdus Salam", "Linkedin"))

        adapter = MyAdapter(data)
    }
}