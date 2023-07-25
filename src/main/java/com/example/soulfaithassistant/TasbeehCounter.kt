package com.example.soulfaithassistant

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class TasbeehCounter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh_counter)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val tasbeehTypes = arrayOf(
            "Allahuakbar",
            "Alhamdulillah",
            "Subhanallah",
            "Ya Hayyu Ya Qayyum",
            "Astagfirullah",
            "La IIaha Illalalah Muhammadur rasullallah"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.list)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, tasbeehTypes)
        mListView.adapter = arrayAdapter

    }



}