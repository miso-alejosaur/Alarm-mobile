package com.example.alarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_form)

        val backButtonClick = findViewById<ImageButton>(R.id.formBackButton)
        backButtonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val saveButtonClick = findViewById<ImageButton>(R.id.saveAlarmButton)
        saveButtonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val deleteButtonClick = findViewById<ImageButton>(R.id.deleteAlarmButton)
        deleteButtonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val lbutton = findViewById<Button>(R.id.button2)
        var lSelected = true
        lbutton.setOnClickListener {
            if(lSelected){
                lbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                lbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            lSelected = !lSelected
        }

        val mbutton = findViewById<Button>(R.id.button3)
        var mSelected = true
        mbutton.setOnClickListener {
            if(mSelected){
                mbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                mbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            mSelected = !mSelected
        }

        val m2button = findViewById<Button>(R.id.button4)
        var m2Selected = true
        m2button.setOnClickListener {
            if(m2Selected){
                m2button.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                m2button.setBackgroundColor(resources.getColor(R.color.orange))
            }
            m2Selected = !m2Selected
        }

        val jbutton = findViewById<Button>(R.id.button5)
        var jSelected = true
        jbutton.setOnClickListener {
            if(jSelected){
                jbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                jbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            jSelected = !jSelected
        }

        val vbutton = findViewById<Button>(R.id.button6)
        var vSelected = true
        vbutton.setOnClickListener {
            if(vSelected){
                vbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                vbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            vSelected = !vSelected
        }

        val sbutton = findViewById<Button>(R.id.button7)
        var sSelected = true
        sbutton.setOnClickListener {
            if(sSelected){
                sbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                sbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            sSelected = !sSelected
        }

        val dbutton = findViewById<Button>(R.id.button8)
        var dSelected = true
        dbutton.setOnClickListener {
            if(dSelected){
                dbutton.setBackgroundColor(resources.getColor(R.color.surfaceDark))
            } else {
                dbutton.setBackgroundColor(resources.getColor(R.color.orange))
            }
            dSelected = !dSelected
        }
    }
}