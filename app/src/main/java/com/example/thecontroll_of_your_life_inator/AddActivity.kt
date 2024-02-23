package com.example.thecontroll_of_your_life_inator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        findViewById<Button>(R.id.returnAddButton).
            setOnClickListener {
                finish()
            }
    }
}