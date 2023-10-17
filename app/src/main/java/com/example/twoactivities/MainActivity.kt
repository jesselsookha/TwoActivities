package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOther = findViewById<Button>(R.id.btnOtherScreen)

        btnOther.setOnClickListener {
            callOtherScreen()
        }
    }

    private fun callOtherScreen(){
        val intent = Intent(this, otherScreen::class.java)
        startActivity(intent)
    }
}