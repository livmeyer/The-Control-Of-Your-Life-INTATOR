package com.example.thecontroll_of_your_life_inator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        findViewById<Button>(R.id.addTaskButton).
            setOnClickListener {
                val intent = Intent(this, AddActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.removeTaskButton).
            setOnClickListener {
                val intent = Intent(this, RemoveActivity::class.java)
                startActivity(intent)
            }
        findViewById<Button>(R.id.returnButton).
            setOnClickListener {
                finish()
            }
    }
}