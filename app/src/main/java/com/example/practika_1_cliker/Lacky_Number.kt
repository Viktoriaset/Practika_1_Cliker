package com.example.practika_1_cliker

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class Lacky_Number : AppCompatActivity() {
    private lateinit var lucky_number_text: TextView
    private lateinit var bg: View

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lacky_number)
        lucky_number_text = findViewById(R.id.Text_lucky_Number)
        var points:Int = intent.getIntExtra("Points", 0)
        lucky_number_text.text = "Your lucky number: " + (0..points).random().toString()
        bg = findViewById(R.id.backGround)
        val color = Color.argb(255, (0..255).random(), (0..255).random(), (0..255).random())
        bg.setBackgroundColor(color)
    }

    public fun to_Menu(view : View){
        val I: Intent
        I = Intent(this@Lacky_Number, MainActivity::class.java)
        startActivity(I)
    }


}