package com.natashazahr.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.OutcomeReceiver
import android.widget.TextView

class IntentDenganData : AppCompatActivity() {
    //LESSON 3 companiaon aobject -> sama kaya $ , kalo $ -> manggil variabel
    // kalo companion object manggil class
    companion object{
        const val EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvReceiver : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_dengan_data)

        tvReceiver = findViewById(R.id.tv_penerima_data)

        val textReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "text yang diterima : $textReceived"

        tvReceiver.text = text

    }
}