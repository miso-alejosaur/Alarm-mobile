package com.example.alarm

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val alarmName: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_alarm_item, this, true)

        alarmName = view.findViewById(R.id.alarmName)
    }

    fun setAlarm(name: String) {

    }
}