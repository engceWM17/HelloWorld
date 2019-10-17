package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {//:=extends

    //onCreate =main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Create the UI
        //R =resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //Java int x; vs Kotlin val x:Int
        //val =value, var = variable
        //findViewById = link program to UI
        val buttonClickMe : Button =findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.TextViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }
}
