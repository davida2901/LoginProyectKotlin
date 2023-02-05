package com.example.loginproyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        title = "Register"

        val backButton :Button = findViewById(R.id.buttonBackRegister)
        val cancelButton : Button = findViewById(R.id.buttonCancelRegister)
        val acceptButton : Button = findViewById(R.id.buttonAcceptRegister)


        backButton.setOnClickListener(){
            startActivity(Intent(this, LoginActivity::class.java))
        }
        cancelButton.setOnClickListener(){
            startActivity(Intent(this, LoginActivity::class.java))
        }
        acceptButton.setOnClickListener(){
            startActivity(Intent(this, ProfileActivity::class.java))
        }


        register()
    }

    private fun register(){
        val name : TextView = findViewById(R.id.textViewName)
        val lastName : TextView = findViewById(R.id.textViewName)
        val gender : TextView = findViewById(R.id.textViewName)
        val birthday : TextView = findViewById(R.id.textViewName)
        val country : TextView = findViewById(R.id.textViewName)
        val city : TextView = findViewById(R.id.textViewName)
        val email : TextView = findViewById(R.id.textViewName)
        val phone : TextView = findViewById(R.id.textViewName)


    }
}