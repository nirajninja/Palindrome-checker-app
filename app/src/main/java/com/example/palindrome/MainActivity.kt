package com.example.palindrome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val text:String=tv.text.toString()
            tv.setText("")
            var reverseString = ""
            var length = text.length

            for (i in (length - 1) downTo 0) {
                reverseString += text[i]
            }

            // Case in-sensitive comparision
            if (text.equals(reverseString, ignoreCase = true)) {
                Toast.makeText(this, "palindrome",Toast.LENGTH_LONG).show()

                // println("The given string is Palindrome")
            } else {
                Toast.makeText(this, "Not a palindrome",Toast.LENGTH_LONG).show()
            }
        }
    }
}