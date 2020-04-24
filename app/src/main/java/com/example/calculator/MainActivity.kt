package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun znumberClick(view: View) {
        //  val EntryData = editText.text
        if (isNewOp){
            editText.setText("")
        }
        isNewOp = false
        val buSelect = view as Button
        var buttonClickValue: String = editText.text.toString()
        when (buSelect.id) {
            but0.id -> {
                buttonClickValue += "0"
            }
            but1.id -> {
                buttonClickValue += "1"
            }
            but2.id -> {
                buttonClickValue += "2"
            }
            but3.id -> {
                buttonClickValue += "3"
            }
            but4.id -> {
                buttonClickValue += "4"
            }
            but5.id -> {
                buttonClickValue += "5"
            }
            but6.id -> {
                buttonClickValue += "6"
            }
            but7.id -> {
                buttonClickValue += "7"
            }
            but8.id -> {
                buttonClickValue += "8"
            }
            but9.id -> {
                buttonClickValue += "9"
            }
            butPlus.id -> {
                buttonClickValue += "+"
            }
            butDot.id -> {
                buttonClickValue += "."
            }
            butMultiply.id -> {
                buttonClickValue += "*"
            }
            butPlusMinus.id -> {
                buttonClickValue = "-" + buttonClickValue + "+"
            }
            butPercentage.id -> {
                buttonClickValue += "%"
            }
            butEqual.id -> {
                buttonClickValue += "="
            }
            butMinus.id -> {
                buttonClickValue += "-"
            }
            butClear.id -> {
                buttonClickValue += ""
            }
            butDivide.id -> {
                buttonClickValue += "/"
            }
        }
        editText.setText(buttonClickValue)

    }

    var op ="*"
    var oldNumber = ""
    var isNewOp = true
    fun buttonClickOpe(view: View) {
        val buSelect = view as Button
        when (buSelect.id) {
            butDivide.id -> {
                op = "/"
            }
            butMinus.id -> {
                op = "-"
            }
            butMultiply.id -> {
                op = "*"
            }

            butPlus.id -> {
                op = "+"
            }
        }
        oldNumber = editText.text.toString()
        isNewOp = true
    }
    fun buttonEqualEvent(view: View){
        val newNumber = editText.text.toString()
        var finalNumber:Double? = null
        when(op){
            "*"->{
                finalNumber = oldNumber.toDouble() *newNumber.toDouble()
            }
            "/"->{
                finalNumber = oldNumber.toDouble() /newNumber.toDouble()

            }
            "+"->{
                finalNumber = oldNumber.toDouble() +newNumber.toDouble()

            }
            "-"->{
                finalNumber = oldNumber.toDouble() -newNumber.toDouble()
            }
        }
        editText.setText(finalNumber.toString())
        isNewOp = true
    }
    fun PercentClick(view: View){
        val number:Double = editText.text.toString().toDouble()
        editText.setText(number.toString())
    }

    fun buttonClear(view: View){
        editText.setText("0")
        isNewOp = true

    }
}
