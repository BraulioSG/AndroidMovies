package com.example.peliculasp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RestorePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restore_password)

        val loginBtn = findViewById<Button>(R.id.resLogin);
        val homeBtn = findViewById<Button>(R.id.resHome);

        loginBtn.setOnClickListener {
            startActivity(Intent(this, Login::class.java));
        }
        homeBtn.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java));
        }
    }
}