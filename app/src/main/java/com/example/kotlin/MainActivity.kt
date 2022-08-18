package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {



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
           val strValue: String = findViewById<EditText>(R.id.editText).text.toString()
           val strTextView: String =  findViewById<TextView>(R.id.textView).text.toString()
           if(TextUtils.isEmpty(strValue))
           {
                findViewById<TextView>(R.id.textView).text = strTextView
           }
           else
            findViewById<TextView>(R.id.textView).text = strValue
       }
    }
}