package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var boton1=findViewById<Button>(R.id.button4)
        var txtBuscar=findViewById<TextView>(R.id.textView2)
        boton1.text="INGRESAR"
        boton1.setOnClickListener{
            txtBuscar.text="El evento se ha ejecutado"
            Toast.makeText(
                this,
                "Segundas Oportunidades",
                Toast.LENGTH_SHORT
            ).show()

            var f=Snackbar.make(
                boton1,
                "Estatus",
                Snackbar.LENGTH_SHORT)
            f.show()
        }




    }
}