package com.freakik.pubgurujitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_maps.*

class Maps : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val button = findViewById<Button>(R.id.button)

        button7.setOnClickListener{
            val intent = Intent(this, MapsOne::class.java)

            startActivity(intent)
        }

        button8.setOnClickListener{
            val intent = Intent(this, MapsTwo::class.java)

            startActivity(intent)
        }

        button9.setOnClickListener{
            val intent = Intent(this, MapsThree::class.java)

            startActivity(intent)
        }

        button10.setOnClickListener{
            val intent = Intent(this, MapsFour::class.java)

            startActivity(intent)
        }

        button11.setOnClickListener{
            val intent = Intent(this, MapsFive::class.java)

            startActivity(intent)
        }

        button12.setOnClickListener{
            val intent = Intent(this, MapsSix::class.java)

            startActivity(intent)
        }

    }
}
