package com.example.alarm

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView

class AlarmsAdapter(private val alarms: List<Alarm>) : RecyclerView.Adapter<AlarmsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_alarm_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val alarm = alarms[position]
        holder.bind(alarm)

        holder.itemView.setOnClickListener{ v ->
            val intent = Intent(v.context, FormActivity::class.java)
            v.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return alarms.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        private val alarmName = view.findViewById<TextView>(R.id.alarmName)
        private val alarmHour = view.findViewById<TextView>(R.id.alarmHour)
        private val alarmDow = view.findViewById<TextView>(R.id.alarmDow)
        private val alarmBackupIcon = view.findViewById<ImageView>(R.id.backupPersonIcon)
        private val turnoffIcon = view.findViewById<ImageView>(R.id.turnoffIcon)

        fun bind(alarm: Alarm) {
            alarmName.text = alarm.name
            alarmHour.text = alarm.hour
            alarmDow.text = alarm.dow
            if(!alarm.hasBackup){
                alarmBackupIcon.setColorFilter(R.color.backDark)
            }
            turnoffIcon.setImageResource(alarm.method)
        }

    }
}