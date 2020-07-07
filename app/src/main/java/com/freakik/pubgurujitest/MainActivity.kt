package com.freakik.pubgurujitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import com.freakik.pubgurujitest.DEVELOPED
import com.freakik.pubgurujitest.Maps
import com.freakik.pubgurujitest.Strategies
import com.freakik.pubgurujitest.Weapons
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, Maps::class.java)

            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent = Intent(this, Weapons::class.java)

            startActivity(intent)
        }

        button3.setOnClickListener{
            val intent = Intent(this, Strategies::class.java)

            startActivity(intent)
        }

        button24.setOnClickListener{
            val intent = Intent(this, DEVELOPED::class.java)

            startActivity(intent)
        }


    }
}


