package com.course.networking.detail

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.course.networking.R
import kotlinx.android.synthetic.main.content_detail_wisata.*

class DetailWisataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
        setSupportActionBar(findViewById(R.id.toolbar))

        val nama = intent.getStringExtra("jdl")
        val desk = intent.getStringExtra("desk")
        val img = intent.getStringExtra("img")

        judulDetail.text = nama
        deskDetail.text = desk

        Glide.with(this).load(img).into(imgDetail)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}