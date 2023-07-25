package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DuaAct : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)


        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val prayerNames = arrayOf(
            "Dua 1", "Dua 2", "Dua 3", "Dua 4", "Dua 5"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.duaslist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, prayerNames)
        mListView.adapter = arrayAdapter

    }
}