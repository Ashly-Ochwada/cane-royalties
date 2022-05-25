package com.example.hb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OurMenuActivity : AppCompatActivity() {
    lateinit var btnBack2: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_our_menu)
        btnBack2=findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,ContactActivity::class.java)
            startActivity(intent)
        }
    }
}