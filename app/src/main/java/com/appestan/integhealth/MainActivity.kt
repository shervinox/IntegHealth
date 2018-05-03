package com.appestan.integhealth

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val testString: String by lazy { "test String" }


    lateinit var statusTextview: TextView
    lateinit var mainButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        statusTextview = findViewById(R.id.status_textview)
        mainButton = findViewById(R.id.main_button)
        mainButton.setOnClickListener(check())
    }

    private fun check(): View.OnClickListener? {
        statusTextview.text = "checking ..."
        return null
    }


}
