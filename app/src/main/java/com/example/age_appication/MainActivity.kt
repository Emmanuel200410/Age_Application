package com.example.age_appication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        private val famousPeople = listOf(
            Pair("Nelson Mandela", 95),
            Pair("William Shakespeare", 52),
            Pair("queen elizabeth", 96),
            Pair("Steve jobbs",56),
            Pair("pele",82),
            Pair("maradona" ,60),
            Pair("kobe bryant" ,41),
            Pair("stan lee" ,94),
            Pair("leonardo da vinci" ,67)

        )
        private lateinit var ageInput: EditText
        private lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ageInput = findViewById(R.id.editTextText)
        resultTextView = findViewById(R.id.text_view)
        val checkButton: Button = findViewById(R.id.button)
        val clearButton: Button = findViewById(R.id.button4)
        checkButton.setOnClickListener {
            checkAge()
        }
        clearButton.setOnClickListener {
            clearFields()


}