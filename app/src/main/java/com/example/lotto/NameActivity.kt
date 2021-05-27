package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGo = findViewById<Button>(R.id.btnGo)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGo.setOnClickListener{
            startActivity(Intent(this,NameActivity::class.java))
        }
        btnBack.setOnClickListener{
            startActivity(Intent(this,NameActivity::class.java))
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}