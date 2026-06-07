package com.example.arithmeticcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sqrt
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var num1Input: EditText
        lateinit var txtOp: TextView
        lateinit var num2Input : EditText
        lateinit var txtEquals : TextView
        lateinit var answerOutput:TextView
        lateinit var btnAddition :Button
        lateinit var btnSubtraction:Button
        lateinit var btnMultiplication :Button
        lateinit var btnDivision :Button
        lateinit var btnSqrt : Button
        lateinit var btnPower: Button
        lateinit var btnClear :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        num1Input=findViewById(R.id.num1Input)
        txtOp=findViewById(R.id.txtOp)
        num2Input=findViewById(R.id.num2Input)
        txtEquals=findViewById(R.id.txtEquals)
        answerOutput=findViewById(R.id.answerOutput)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtraction=findViewById(R.id. btnSubtraction)
        btnMultiplication=findViewById(R.id.btnMultiplication)
        btnDivision=findViewById(R.id.btnDivision)
        btnSqrt=findViewById(R.id.btnSqrt)
        btnPower=findViewById(R.id.btnPower)
        btnClear=findViewById(R.id.btnClear)

        btnSqrt.setOnClickListener{

            val num1=num1Input.text.toString().toDouble()
            val num2=num2Input.text.toString().toDouble()
            val answer=num1+num2


                answerOutput.setText("" + sqrt(answer))
        }
        btnPower.setOnClickListener{
            val num1=num1Input.text.toString().toDouble()
            val num2=num2Input.text.toString().toDouble()
            val answer=num1+num2

            answerOutput.setText("" +  num1.pow(num2))
        }
        btnAddition.setOnClickListener{
            val num1=num1Input.text.toString().toDouble()
            val num2=num2Input.text.toString().toDouble()
            val answer=num1+num2
            txtOp.text="+"
            answerOutput.setText(""+ answer)


        }

        btnAddition.setOnClickListener{
            val num1=num1Input.text.toString().toDouble()
            val num2=num2Input.text.toString().toDouble()
            val answer=num1+num2
            txtOp.text="-"
            answerOutput.setText(""+ answer)}

        btnClear.setOnClickListener{
            num1Input.text.clear()
            num2Input.text.clear()
            answerOutput.setText("")

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtmain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}