package com.example.peliculasp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val homeBtn = findViewById<Button>(R.id.signHome);
        val loginBtn = findViewById<Button>(R.id.signLogin);

        homeBtn.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java));
        }
        loginBtn.setOnClickListener {
            startActivity(Intent(this, Login::class.java));
        }
    }
}