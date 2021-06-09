package com.sssakib.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val streetFoodArray = arrayOf("Kadi Kachodi", "Aalu Ki Tikiya", "Paani Puri", "Bhel Puri", "Vada Pav")
        listViewStreetFood.adapter=
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, streetFoodArray )
        listViewStreetFood.setOnItemClickListener { parent, view, position, id ->
            textViewResponse.text="You have selected "+streetFoodArray[position]
        }
    }
}