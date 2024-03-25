package com.practicum.playlistmaker2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

     /*   findViewById<Button>(R.id.arrow_back).setOnClickListener {
            val intent = Intent()
            intent.putExtra("MainActivity", true)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }*/
    }
}