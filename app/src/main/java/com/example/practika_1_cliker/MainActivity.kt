package com.example.practika_1_cliker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var CounterText: TextView
    private var Counter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CounterText = findViewById(R.id.Counter_Text)
    }

    public fun counterUpdate(view : View){
        Counter++
        CounterText.text = Counter.toString()
    }
}