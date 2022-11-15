package com.example.apv5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.a1).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.a)
        }
        findViewById<Button>(R.id.a2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.b)
        }
        findViewById<Button>(R.id.a3).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.c)
        }
    }
}