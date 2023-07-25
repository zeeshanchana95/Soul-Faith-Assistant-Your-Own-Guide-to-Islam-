package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class NaatAct : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naat)


        val arrayAdapter: ArrayAdapter<*>
        val prayerNames = arrayOf(
            "Naat Name 1", "Naat Name 2", "Naat Name 3", "Naat Name 4", "Naat Name 5"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.naatlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, prayerNames)
        mListView.adapter = arrayAdapter
    }

}