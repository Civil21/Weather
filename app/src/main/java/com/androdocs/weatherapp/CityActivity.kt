package com.androdocs.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_city.*

class CityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        fab_search.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            val s =tiet_city.text
            intent.putExtra("city",tiet_city.text.toString())

            startActivity(intent)
            finish()
        }
    }
}
