package com.example.st10082074_tridenttimetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginBtn)
        val registerButton = findViewById<Button>(R.id.registerBtn)

        loginButton.setOnClickListener(View.OnClickListener {
            fun onClick(view: View?) {
                // Handle register button click
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }
        })

        registerButton.setOnClickListener(View.OnClickListener {
            fun onClick(view: View?) {
                // Handle register button click
                startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
            }
        })
    }
}