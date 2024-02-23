package com.example.thecontroll_of_your_life_inator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RemoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove)
        findViewById<Button>(R.id.returnRemoveButton).
            setOnClickListener {
                finish()
            }
    }
}