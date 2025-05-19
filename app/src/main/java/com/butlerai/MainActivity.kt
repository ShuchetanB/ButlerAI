
package com.butlerai

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.userInput)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val aiOutput = findViewById<TextView>(R.id.aiOutput)

        submitButton.setOnClickListener {
            val inputText = userInput.text.toString()
            val response = "You said: $inputText\n[Awaiting AI Module Integration]"
            aiOutput.text = response
        }
    }
}
