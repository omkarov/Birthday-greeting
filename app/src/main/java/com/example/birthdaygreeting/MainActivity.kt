package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Createbirthdaycard(view: View) {
        val intent= Intent( this,greeting_card_activity::class.java)
        val name= editTextName.editableText.toString()
        intent.putExtra(greeting_card_activity.Name_Extra, name)
        startActivity(intent)


//        val name= editTextName.editableText.toString()
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()
    }
}