package com.example.practika_1_cliker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var counterText: TextView
    private var counter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.Counter_Text)
    }

    public fun counterUpdate(view : View){
        counter++
        counterText.text = "Your points: " + counter.toString()
    }

    public fun to_LuckyNumber(view : View){
        val lucky_Number: Intent
        lucky_Number = Intent(this@MainActivity, Lacky_Number::class.java)
        lucky_Number.putExtra("Points", counter)
        startActivity(lucky_Number)
    }
}