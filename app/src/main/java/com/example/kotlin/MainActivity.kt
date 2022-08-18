package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    lateinit var strValue: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnTextColor).setOnClickListener {
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }
       findViewById<Button>(R.id.btnChangeView).setOnClickListener {
           findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.cornsilk))
       }
       findViewById<Button>(R.id.btnChangeText).setOnClickListener {
            strValue = findViewById<EditText>(R.id.editText).text.toString();
            findViewById<TextView>(R.id.textView).text = strValue;

       }
    }
}