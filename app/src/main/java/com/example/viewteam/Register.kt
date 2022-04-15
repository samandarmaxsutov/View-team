package com.example.viewteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        charity_taker.setOnClickListener {
            val intent=Intent(this,CharitTakerRegister::class.java)
            startActivity(intent)
        }

        philantropist.setOnClickListener {
            val intent=Intent(this,PhilantropistRegister::class.java)
            startActivity(intent)
        }

    }
}