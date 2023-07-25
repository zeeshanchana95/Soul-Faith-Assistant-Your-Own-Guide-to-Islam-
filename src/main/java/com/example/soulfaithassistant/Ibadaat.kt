package com.example.soulfaithassistant

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class Ibadaat : Fragment() {
/*

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
*/

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_ibadaat, container, false)

        //add english date
        val formatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy")
        val current = LocalDate.now().format(formatter)
        val d=v?.findViewById<TextView>(R.id.english_date)
        d?.text = current.toString()


        //adding events
        val qiblaclick=v?.findViewById<ImageView>(R.id.qiblaImg)
        qiblaclick?.setOnClickListener {
           callCompass()
        }

        val tasbeehC=v?.findViewById<ImageView>(R.id.tasbeehImg)
        tasbeehC?.setOnClickListener {
            callTasbeeh()
        }

        val ramzanT=v?.findViewById<ImageView>(R.id.ramzanImg)
        ramzanT?.setOnClickListener {
            callRamzanTiming()
        }

        val prayerclick=v?.findViewById<ImageView>(R.id.prayeImg)
        prayerclick?.setOnClickListener {
            callPrayer()
        }

        val naatC=v?.findViewById<ImageView>(R.id.naatImg)
        naatC?.setOnClickListener {
            callNaat()
        }

        val duaT=v?.findViewById<ImageView>(R.id.duaImg)
        duaT?.setOnClickListener {
            callDua()
        }

        return v
    }

    fun callCompass(){
        val i= Intent(activity,QiblaDirection::class.java)
        startActivity(i)
    }

    fun callTasbeeh(){
        val i= Intent(activity,TasbeehCounter::class.java)
        startActivity(i)
    }

    fun callRamzanTiming(){
        val i= Intent(activity,RamzanTime::class.java)
        startActivity(i)
    }


    fun callPrayer(){
        val i= Intent(activity,PrayerTim::class.java)
        startActivity(i)
    }

    fun callNaat(){
        val i= Intent(activity,NaatAct::class.java)
        startActivity(i)
    }

    fun callDua(){
        val i= Intent(activity,DuaAct::class.java)
        startActivity(i)
    }


}