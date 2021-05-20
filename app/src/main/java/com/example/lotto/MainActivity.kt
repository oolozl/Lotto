package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constellationCard = findViewById<CardView>(R.id.constellationCard)
        val NameCard = findViewById<CardView>(R.id.NameCard)

        constellationCard.setOnClickListener{
            startActivity(Intent(this,ConstellationActivity::class.java))

        }
        NameCard.setOnClickListener{
            startActivity(Intent(this,NameActivity::class.java))

        }
    }
}