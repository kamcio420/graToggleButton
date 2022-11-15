package com.example.apv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    findViewById<Button>(R.id.btnObrazek).setOnClickListener {
        findViewById<ImageView>(R.id.btmObrazek).setImageResource(R.drawable.mojobrazek)
    }
    }
}