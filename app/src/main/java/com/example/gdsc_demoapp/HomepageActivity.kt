package com.example.gdsc_demoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val welcomebar = findViewById<TextView>(R.id.WelcomeBar)
        val username = intent.getStringExtra(USERNAME)
        welcomebar.text = "Welcome, $username"

        val phone = findViewById<LinearLayout>(R.id.telephone)

        phone.setOnClickListener {
            val phoneNumber = findViewById<TextView>(R.id.telephoneNumber).text
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        val logoutButton = findViewById<Button>(R.id.Logoutbutton)

        logoutButton.setOnClickListener {
            val intent = Intent(this@HomepageActivity, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
    }

    companion object{
        val USERNAME = "username"
    }
}