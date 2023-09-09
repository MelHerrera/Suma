package com.example.suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.num1)
        val numero2 = findViewById<EditText>(R.id.num2)
        val btnSuma = findViewById<Button>(R.id.btnsum)


        btnSuma.setOnClickListener {
            val resul = numero1.text.toString().toInt() + numero2.text.toString().toInt()
            Toast.makeText(this, resul, Toast.LENGTH_LONG).show()
        }
    }
}