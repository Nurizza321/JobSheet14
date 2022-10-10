package com.example.jobsheet14nurizza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Blue = findViewById<Button>(R.id.Blue)
        val Red = findViewById<Button>(R.id.Red)
        val Green = findViewById<Button>(R.id.Green)
        val Orange = findViewById<Button>(R.id.Orange)
        val Purple = findViewById<Button>(R.id.Purple)

        Blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , BlueFragment())
            fragmentTransaction.commit()
        }
        Red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , RedFragment())
            fragmentTransaction.commit()
        }
        Green.setOnClickListener {
            val fragmentTransaction  = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , GreenFragment())
            fragmentTransaction.commit()
        }
        Orange.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , OrangeFragment())
            fragmentTransaction.commit()
        }
        Purple.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer , PurpleFragment())
            fragmentTransaction.commit()
        }
    }
}