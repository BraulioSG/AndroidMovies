package com.example.peliculasp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.FirebaseApp

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val loginBtn = findViewById<Button>(R.id.mainLogin);
        val signupBtn = findViewById<Button>(R.id.mainSignup);

        loginBtn.setOnClickListener {
            startActivity(Intent(this, Login::class.java));
        }
        signupBtn.setOnClickListener {
            startActivity(Intent(this, Signup::class.java));
        }
    }
}