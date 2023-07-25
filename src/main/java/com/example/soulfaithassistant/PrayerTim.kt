package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class PrayerTim : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prayer_tim)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val prayerNames = arrayOf(
            "Fajr", "Zuhr", "Asr", "Magrib", "Isha"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.Prayerlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, prayerNames)
        mListView.adapter = arrayAdapter

    }
}