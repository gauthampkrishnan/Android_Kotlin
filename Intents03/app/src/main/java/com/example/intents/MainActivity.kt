package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val KEY_1 = "Name"
const val KEY_2 = "Age"
const val KEY_3 = "isStudent"
const val KEY_4 = "programmer"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(KEY_1,"Gautham")
            i.putExtra(KEY_2,21)
            i.putExtra(KEY_3,"Yes")
            i.putExtra(KEY_4,false)
            startActivity(i)
        }
        mailBtn.setOnClickListener{
            val email = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents")
            startActivity(i)
        }
        browseBtn.setOnClickListener{
            val address = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("https://$address")
            startActivity(i)
        }
        dialBtn.setOnClickListener{
            val mobile = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$mobile")
            startActivity(i)
        }

    }
}