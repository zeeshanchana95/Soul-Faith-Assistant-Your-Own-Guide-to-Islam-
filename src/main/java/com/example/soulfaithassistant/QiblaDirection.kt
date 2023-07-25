package com.example.soulfaithassistant

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class QiblaDirection : AppCompatActivity(){


    private lateinit var sensorManager: SensorManager
    private lateinit var sensor: Sensor
    private lateinit var needleImage: ImageView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qibla_direction)

        needleImage = findViewById(R.id.imgCompass)
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION)
    }

    private val sensorListener = object : SensorEventListener {
        override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
            // not needed
        }

        override fun onSensorChanged(event: SensorEvent?) {
            if (event == null) return

            val degree = Math.round(event.values[0])
            needleImage.rotation = -degree.toFloat()
        }
    }

    override fun onResume() {
        super.onResume()

        sensorManager.registerListener(
            sensorListener,
            sensor,
            SensorManager.SENSOR_DELAY_GAME
        )
    }

    override fun onPause() {
        super.onPause()

        sensorManager.unregisterListener(sensorListener)
    }
}