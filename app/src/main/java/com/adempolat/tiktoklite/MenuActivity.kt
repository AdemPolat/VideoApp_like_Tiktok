package com.adempolat.tiktoklite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnanimal.setOnClickListener {
            intent = Intent(applicationContext, AnimalActivity::class.java)
            startActivity(intent)
        }

        btncolourful.setOnClickListener {
            intent = Intent(applicationContext, ColourfulActivity::class.java)
            startActivity(intent)
        }

        btnflower.setOnClickListener {
            intent = Intent(applicationContext, FlowerActivity::class.java)
            startActivity(intent)
        }

        btngame.setOnClickListener {
            intent = Intent(applicationContext, GameActivity::class.java)
            startActivity(intent)
        }

        btnhuman.setOnClickListener {
            intent = Intent(applicationContext, HumanActivity::class.java)
            startActivity(intent)
        }

        btnlife.setOnClickListener {
            intent = Intent(applicationContext, LifeActivity::class.java)
            startActivity(intent)
        }

        btnmusic.setOnClickListener {
            intent = Intent(applicationContext, MusicActivity::class.java)
            startActivity(intent)
        }

        btnsky.setOnClickListener {
            intent = Intent(applicationContext, SkyActivity::class.java)
            startActivity(intent)
        }

        // Animal
        // Colourful
        // Flower
        // Game

        // Human
        // Life
        // Music
        // Sky


    }
}