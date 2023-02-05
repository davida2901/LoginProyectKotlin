package com.example.loginproyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        title = "Login"

        val lostPassWordButton : TextView = findViewById(R.id.textViewLostPassword)
        val registerButton :Button = findViewById(R.id.buttonRegister)


        lostPassWordButton.setOnClickListener(){
            startActivity(Intent(this,LostPasswordActivity::class.java))
        }

        registerButton.setOnClickListener(){
            startActivity(Intent(this,RegisterActivity::class.java))
        }

        login()
    }



    private fun login(){
        val emailText : EditText = findViewById(R.id.editTextEmail)
        val passText : EditText = findViewById(R.id.editTextPassword)
        val loginButton :Button = findViewById(R.id.buttonLogin)
        loginButton.setOnClickListener(){
            if(emailText.text.isNotEmpty() &&
                passText.text.isNotEmpty() && passText.length()>=8)
            {
                startActivity(Intent(this,ProfileActivity::class.java))
            }
            else{
                showAlert("An error occurred during the authentication")
            }
        }
    }

    private fun showAlert(alert: String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage(alert)
        builder.setPositiveButton("Accept",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun isValidPassword(){
        showAlert("Password should have more than 8 character")
    }



}

