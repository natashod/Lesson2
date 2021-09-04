package com.natashazahr.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
//LESSON 2 + LESSON 3 + LESSON 4
// LESSON 2 : button intent
// LESSON 3 : button intent dengan data
// LESSON 4 :

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        val btnIntentObject = findViewById<Button>(R.id.btn_move_object)

        val btnIntentData = findViewById<Button>(R.id.btn_intent_data)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObject.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
         when(p0.id){
             R.id.btn_intent -> run {
                 val intentBiasa = Intent(this@MainActivity, IntentBiasaActivity::class.java )
             startActivity(intentBiasa)
             }
            R.id.btn_intent_data -> run {
                val intentData = Intent(this@MainActivity, IntentDenganData::class.java)
                intentData.putExtra(IntentDenganData.EXTRA_TEXT, "Hello Future")
                startActivity(intentData)

            }
            R.id.btn_move_object -> run {
                val mobil = Mobil(
                    "Toyota Avanza",
                    2010,
                    "D 100 XF",
                )
                val intentObject = Intent(this@MainActivity , IntentObjectAct::class.java)
                intentObject.putExtra(IntentObjectAct.EXTRA_MOBIL, mobil)
                startActivity(intentObject)

            }
         }
    }
}