package com.example.soulfaithassistant

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Home : Fragment() {

//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val v = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment

        val formatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy")
        val current = LocalDate.now().format(formatter)
        val d=v?.findViewById<TextView>(R.id.english_date)
        d?.text = current.toString()
        return v
    }


}