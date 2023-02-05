package com.example.loginproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title = "Profile"

        val backButton:Button = findViewById(R.id.buttonBackRegister)
        backButton.setOnClickListener(){
            finish()
        }
    }
}