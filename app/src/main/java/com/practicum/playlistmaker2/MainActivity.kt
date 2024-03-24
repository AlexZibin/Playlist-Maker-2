package com.practicum.playlistmaker2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSearch = findViewById<Button>(R.id.btn_search)
        //val btnMedia = findViewById<Button>(R.id.btn_media)
        val btnSettings = findViewById<Button>(R.id.btn_settings)

        val imageClickListener1: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на btn_search!", Toast.LENGTH_SHORT).show()
            }
        }
        btnSearch.setOnClickListener(imageClickListener1)

        findViewById<Button>(R.id.btn_media).setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на btn_media!", Toast.LENGTH_SHORT).show()
        }

        val imageClickListener3: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на btn_settings!", Toast.LENGTH_SHORT).show()
            }
        }
        btnSettings.setOnClickListener(imageClickListener3)

    }
}