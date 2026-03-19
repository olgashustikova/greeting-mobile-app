package com.example.greatingmobileapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)

        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()

            if (name.isEmpty()) {
                tvGreeting.text = "Please enter name"
            } else {
                tvGreeting.text = "Hello, $name!"
            }
        }
    }
}