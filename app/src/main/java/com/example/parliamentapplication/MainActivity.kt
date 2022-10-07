package com.example.parliamentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

import androidx.databinding.DataBindingUtil


import com.example.parliamentapplication.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}