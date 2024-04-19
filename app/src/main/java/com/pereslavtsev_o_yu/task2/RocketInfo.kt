package com.pereslavtsev_o_yu.task2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RocketInfo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rocket_info)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<ImageView>(R.id.back).setOnClickListener(View.OnClickListener {
            finish()
        })
        findViewById<ImageView>(R.id.share).setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Share", Toast.LENGTH_LONG).show()
        })
        findViewById<ImageView>(R.id.youtube).setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "YouTube", Toast.LENGTH_LONG).show()
        })
        findViewById<ImageView>(R.id.reddit).setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Reddit", Toast.LENGTH_LONG).show()
        })
    }
}