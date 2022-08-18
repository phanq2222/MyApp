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
           findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.dark_cyan))
       }
       findViewById<Button>(R.id.btnChangeText).setOnClickListener {
           val strValue: String = findViewById<EditText>(R.id.editText).text.toString()
           if(TextUtils.isEmpty(strValue))
           {
                findViewById<TextView>(R.id.textView).setText(resources.getString(R.string.text_view_default))
           }
           else
            findViewById<TextView>(R.id.textView).text = strValue
       }
       findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener{
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.design_default_color_background))
           findViewById<TextView>(R.id.textView).setText(resources.getString(R.string.text_view_default))
           findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.black))
           findViewById<EditText>(R.id.editText).setText(resources.getString(R.string.edit_text_default))
       }
    }
}