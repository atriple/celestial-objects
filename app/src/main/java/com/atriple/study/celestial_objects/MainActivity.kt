package com.atriple.study.celestial_objects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atriple.study.celestial_objects.adapter.ListCelestialObjectAdapter
import com.atriple.study.celestial_objects.model.CelestialObject
import com.atriple.study.celestial_objects.model.generate

class MainActivity : AppCompatActivity() {
    private lateinit var rvCelestialObject: RecyclerView
    private val listOfCelestialObject: List<CelestialObject> = generate() //TODO: Lazy Load this List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.main_toolbar))

        rvCelestialObject = findViewById(R.id.rv_celestial_objects)
        rvCelestialObject.setHasFixedSize(true)

        rvCelestialObject.layoutManager = LinearLayoutManager(this)

        val celestialObjectAdapter = ListCelestialObjectAdapter(listOfCelestialObject)
        rvCelestialObject.adapter = celestialObjectAdapter
        celestialObjectAdapter.setOnItemClickCallback(object: ListCelestialObjectAdapter.OnItemClickCallback {
            override fun onItemClicked(data: CelestialObject) {
                val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
                detailIntent.putExtra("name", data.name)
                startActivity(detailIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
