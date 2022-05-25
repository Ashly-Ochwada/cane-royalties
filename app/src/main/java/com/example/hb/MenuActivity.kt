package com.example.hb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    lateinit var btnNxtMenu:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btnNxtMenu=findViewById(R.id.btnNxtMenu)
        btnNxtMenu.setOnClickListener {
            val intent=Intent(this,OurMenuActivity::class.java)
            startActivity(intent)
        }
    }
}