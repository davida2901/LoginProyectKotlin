package com.example.loginproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LostPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_password)

        title = "Lost Account"

        var cancelButton :Button = findViewById(R.id.buttonLostAccountCancel)
        cancelButton.setOnClickListener(){
            finish()
        }
    }
}