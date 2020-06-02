package com.atriple.study.celestial_objects

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private lateinit var tvName : TextView
    private lateinit var tvTitle : TextView
    private lateinit var tvInformationContent : TextView
    private lateinit var tvDescriptionContent : TextView
    private lateinit var imgCelestialObject: ImageView

    //TODO: Bad Practice, it's better to create default value in String, but I will pass this one
    // since I assume every data will have the value
    private var url : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.detail_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        tvName = findViewById(R.id.tv_detail_name)
        tvTitle = findViewById(R.id.tv_detail_title)
        tvInformationContent = findViewById(R.id.tv_information_content)
        tvDescriptionContent = findViewById(R.id.tv_description_content)
        imgCelestialObject = findViewById(R.id.img_detail_picture)

        tvName.text = intent.getStringExtra("name")
        tvTitle.text = intent.getStringExtra("title")
        tvInformationContent.text = intent.getStringExtra("fact")
        tvDescriptionContent.text = intent.getStringExtra("description")
        url = intent.getStringExtra("url")
        imgCelestialObject.setImageResource(intent.getIntExtra("image", R.drawable.img_earth))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_wikipedia -> {
            val wikipediaIntent = Intent(Intent.ACTION_VIEW)
            wikipediaIntent.data = Uri.parse(url)
            startActivity(wikipediaIntent)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
