package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var textInput: EditText
    val players = arrayOf("1","2","3","4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.textInput)
        val spinnerInput = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, players)
        spinnerInput.adapter = arrayAdapter
        spinnerInput.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext, "selected: "+players[p2], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    fun buttonClick(view: View) {
        if (textInput.text.isEmpty()) {
            Toast.makeText(this, "puste pole", Toast.LENGTH_LONG).show()
        } else {
//            println("hej: " + textInput.text)
            Toast.makeText(this, "hej: " + textInput.text, Toast.LENGTH_LONG).show()
        }

    }
}