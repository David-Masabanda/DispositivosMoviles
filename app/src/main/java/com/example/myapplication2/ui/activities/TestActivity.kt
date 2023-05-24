package com.example.myapplication2.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.R
import com.example.myapplication2.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        binding=ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.button.setOnClickListener{
            binding.textView.text="SAPA"
        }

    }
}