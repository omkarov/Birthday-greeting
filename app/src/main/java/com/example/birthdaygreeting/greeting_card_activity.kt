package com.example.birthdaygreeting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting_card.*

class greeting_card_activity : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_card)

        val name=intent.getStringExtra(Name_Extra)
        birthdayGreeting_text.text="Happy Birthday\n$name!"
    }

}