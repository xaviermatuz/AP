package com.example.agenda_personal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CalendarView
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarView = findViewById<CalendarView>(R.id.calendarview)
        calendarView?.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Note that months are indexed from 0. So, 0 means January, 1 means february, 2 means march etc.
            val msg = "La fecha seleccionada es " + dayOfMonth + "/" + (month + 1) + "/" + year
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }

        // Obtener referencia al primer ImageView
        val click = findViewById<ImageView>(R.id.primer)
        // set on-click listener
        click.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            //Toast.makeText(this@MainActivity, getString((R.string.primer_mensaje)), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Primer::class.java)
            // start your next activity
            startActivity(intent)
        }

        // Obtener referencia al segundo ImageView
        val click2 = findViewById<ImageView>(R.id.segundo)
        // set on-click listener
        click2.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            //Toast.makeText(this@MainActivity,getString((R.string.segundo_mensaje)), Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Segundo::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}
