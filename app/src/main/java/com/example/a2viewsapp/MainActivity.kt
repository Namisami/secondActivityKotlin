package com.example.a2viewsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textEdit = findViewById<EditText>(R.id.edit_text)
        val phoneNumber = findViewById<EditText>(R.id.edit_text_phone)
        val secondActivityButton = findViewById<Button>(R.id.start_second_activity)
        val openContactsButton = findViewById<Button>(R.id.start_phone)

        secondActivityButton.setOnClickListener {
            startSecondActivity(textEdit.text.toString())
        }
        openContactsButton.setOnClickListener {
            openContacts(phoneNumber.text.toString())
        }
    }

    private fun startSecondActivity(text: String) {
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("EXTRA_DATA", text)
        }
        startActivity(intent)
    }

    private fun openContacts(phone: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phone")
        }
        startActivity(intent)
    }
}