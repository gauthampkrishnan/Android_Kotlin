package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.jar.Attributes

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra(KEY_1)
        val age = intent.getIntExtra(KEY_2,0)
        val programmer = intent.getStringExtra(KEY_3)
        val student = intent.getBooleanExtra(KEY_4,false)

        textView.text = "$name $age $programmer $student"  // This is explicit intent


    }
}