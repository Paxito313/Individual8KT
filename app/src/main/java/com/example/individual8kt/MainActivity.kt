package com.example.individual8kt

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.countTextView)
        val toastButton: Button = findViewById(R.id.toastButton)
        val countButton: Button = findViewById(R.id.countButton)

        toastButton.setOnClickListener {
            Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT).show()
        }

        countButton.setOnClickListener {
            count++
            countTextView.text = count.toString()
        }
    }
}
