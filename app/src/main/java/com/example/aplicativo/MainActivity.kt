package com.example.aplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            val conta = total.text.toString().toFloat()
            val grupo = Integer.parseInt(pessoas.text.toString())



            val resultado = conta / grupo

            textView5.text = resultado.toString()
        }
    }
}