package com.natashazahr.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.time.measureTimedValue

class IntentObjectAct : AppCompatActivity() {

    private lateinit var tvReceived : TextView

    companion object {
        const val EXTRA_MOBIL = "extra_mobil"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_object)

        tvReceived = findViewById(R.id.tv_object_receiver)

        val mobil = intent.getParcelableExtra<Mobil>(EXTRA_MOBIL) as Mobil

        val text = "Merk : ${mobil.merk.toString()} \nTahun: ${mobil.tahun.toString()} \nPlat: ${mobil.plat.toString()}"

        tvReceived.text = text


    }
}