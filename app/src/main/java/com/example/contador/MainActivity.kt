package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contador = 0;
        val btn1 = findViewById(R.id.btnadd) as Button
        val btn2 = findViewById(R.id.btnlimpar) as Button
        val btn3 = findViewById(R.id.btnsub) as Button
        val cont = findViewById(R.id.tvCont) as TextView

        btn1.setOnClickListener{
            contador++;
            cont.text = contador.toString()
        }

        btn2.setOnClickListener{
            contador = 0
            cont.text = contador.toString()
        }

        btn3.setOnClickListener{
            contador--;
            cont.text = contador.toString()
        }
    }
}