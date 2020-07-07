package com.freakik.PUBGuruji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_maps.*
import kotlinx.android.synthetic.main.activity_weapons.*

class Weapons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapons)

        val button = findViewById<Button>(R.id.button)

        button18.setOnClickListener{
            val intent = Intent(this, WeaponsOne::class.java)

            startActivity(intent)
        }

        button19.setOnClickListener{
            val intent = Intent(this, WeaponsTwo::class.java)

            startActivity(intent)
        }

        button20.setOnClickListener{
            val intent = Intent(this, WeaponsThree::class.java)

            startActivity(intent)
        }

        button21.setOnClickListener{
            val intent = Intent(this, WeaponsFour::class.java)

            startActivity(intent)
        }

        button22.setOnClickListener{
            val intent = Intent(this, WeaponsFive::class.java)

            startActivity(intent)
        }

        button23.setOnClickListener{
            val intent = Intent(this, WeaponsSix::class.java)

            startActivity(intent)
        }


    }
}
