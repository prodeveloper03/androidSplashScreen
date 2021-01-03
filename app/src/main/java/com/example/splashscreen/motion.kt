package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class motion : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)

        handler = Handler()
        handler.postDelayed({
             val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        } , 5000) // delaying the image for 5 sec to open the main activity

    }
}