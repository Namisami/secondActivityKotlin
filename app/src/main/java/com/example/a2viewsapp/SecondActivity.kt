package com.example.a2viewsapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val secondActivityText = findViewById<TextView>(R.id.second_activity_text)
        secondActivityText.text = intent.getStringExtra("EXTRA_DATA")
    }
}