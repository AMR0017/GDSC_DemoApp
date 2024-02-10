package com.example.gdsc_demoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEdt = findViewById<EditText>(R.id.usernameEdt)
        val username = usernameEdt.text

        val loginButton = findViewById<Button>(R.id.buttonLogin)
        intent.putExtra(HomepageActivity.USERNAME, username.toString())
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)


        loginButton.setOnClickListener {
            val intent = Intent(this@MainActivity, HomepageActivity::class.java)
            Toast.makeText(this, "Login Success!!", Toast.LENGTH_SHORT)
            startActivity(intent)

        }
    }
}