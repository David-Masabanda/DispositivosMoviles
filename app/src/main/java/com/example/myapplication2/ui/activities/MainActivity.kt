package com.example.myapplication2.ui.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
@SuppressLint("MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)








    }

    override fun onDestroy() {
        super.onDestroy()
    }
    override fun onStart() {
        super.onStart()
        initClass()
    }
    fun initClass(){
        binding.button4.setOnClickListener{
            binding.textView2.text="El codigo esta vivo"
            var f=Snackbar.make(
                binding.button4,
                "Estatus",
                Snackbar.LENGTH_SHORT)
            f.show()
        }
    }
}