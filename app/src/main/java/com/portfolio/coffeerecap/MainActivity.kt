package com.portfolio.coffeerecap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnMinus: Button
    lateinit var textViewTotalCups: TextView
    lateinit var textViewTotalCost: TextView
    lateinit var btnAdd: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnMinus = findViewById(R.id.btn_minus)

        textViewTotalCups = findViewById(R.id.textView_total_cups)
        textViewTotalCost = findViewById(R.id.textView_total_cost)

        btnAdd.setOnClickListener{
            val cups = textViewTotalCups.text.toString().toInt()
            val totalCups = cups + 1
            val cost = textViewTotalCost.text.toString().toInt()
            val totalCost = cost + 5
            textViewTotalCost.text = totalCost.toString()
            textViewTotalCups.text = totalCups.toString()


            enableMinusBtn()

        }

        btnMinus.setOnClickListener{
            val cups = textViewTotalCups.text.toString().toInt()

            val totalCups = cups - 1
            val cost = textViewTotalCost.text.toString().toInt()
            val totalCost = cost - 5
            textViewTotalCost.text = totalCost.toString()
            textViewTotalCups.text = totalCups.toString()

            if(totalCups == 0){
                disableMinusBtn()
            }
        }
    }


   private fun disableMinusBtn(){
        btnMinus.isEnabled = false
    }

    private fun enableMinusBtn(){
        btnMinus.isEnabled = true
    }
}
