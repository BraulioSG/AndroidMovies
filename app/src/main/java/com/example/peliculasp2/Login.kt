package com.example.peliculasp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.auth

class Login : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val restoreBtn = findViewById<Button>(R.id.logRestore);
        val signupBtn = findViewById<Button>(R.id.logSignup);
        val loginBtn = findViewById<Button>(R.id.logLogin);

        restoreBtn.setOnClickListener {
            startActivity(Intent(this, RestorePassword::class.java));
        }
        signupBtn.setOnClickListener {
            startActivity(Intent(this, Signup::class.java));
        }

        try{
            auth = Firebase.auth
            loginBtn.setOnClickListener {
                auth.signInWithEmailAndPassword("test@test.com", "contraseña123").addOnCompleteListener{task ->
                    if(task.isSuccessful){
                        Toast.makeText(this, "login - success", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this, task.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }catch(e: Exception){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show()
        }



    }


    public override fun onStart() {
        super.onStart();

        val currentUser = auth.currentUser;
        checkUser(currentUser);
    }

    private fun checkUser(user: FirebaseUser?){
        if(user == null){
            Toast.makeText(this, "no users authenticated", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "please log-in", Toast.LENGTH_SHORT).show();
        }
    }
}