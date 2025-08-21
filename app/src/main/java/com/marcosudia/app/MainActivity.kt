package com.marcosudia.app

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var buttonApp: Button
    private lateinit var myTextView: TextView
    private lateinit var myTextInputView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonApp = findViewById(R.id.buttonApp)
        myTextView = findViewById(R.id.myTextView)
        myTextInputView = findViewById(R.id.myTextInputView)


        buttonApp.text = getString(R.string.button_text)

        buttonApp.setOnClickListener {
            if (myTextInputView.text.isNotEmpty()) {
                val input = myTextInputView.text

                myTextView.visibility = TextView.VISIBLE
                myTextView.text = input
            } else {
                Toast.makeText(this, getString(R.string.text_view_text_message), Toast.LENGTH_SHORT).show()
                myTextView.visibility = TextView.INVISIBLE
                myTextView.text = ""
            }


        }


    }
}