package com.example.alarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = AlarmsAdapter(listOf(
            Alarm("Despertador", "06:00", "L\nM\nM\nJ\nV\n\n", true, R.drawable.ic_outline_camera_alt_24),
            Alarm("Medicina", "21:00", "L\nM\nM\nJ\nV\nS\nD", false, R.drawable.touch),
            Alarm("Fin de semana", "08:00", "\n\n\n\n\nS\nD", false, R.drawable.barcode)
        ))

        val userButtonClick = findViewById<ImageButton>(R.id.userButton)
        userButtonClick.setOnClickListener {
            val intent = Intent(this, RecoverPassActivity::class.java)
            startActivity(intent)
        }

        val createButtonClick = findViewById<ImageButton>(R.id.floatingActionButton)
        createButtonClick.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }

    }

}