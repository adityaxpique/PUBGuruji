package com.freakik.PUBGuruji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_maps.*
import kotlinx.android.synthetic.main.activity_strategies.*

class Strategies : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategies)

        button5.setOnClickListener{
            val intent = Intent(this, StratOne::class.java)

            startActivity(intent)
        }

        button6.setOnClickListener{
            val intent = Intent(this, StratTwo::class.java)

            startActivity(intent)
        }

        button13.setOnClickListener{
            val intent = Intent(this, StratThree::class.java)

            startActivity(intent)
        }

        button14.setOnClickListener{
            val intent = Intent(this, StratFour::class.java)

            startActivity(intent)
        }

        button15.setOnClickListener{
            val intent = Intent(this, StratFive::class.java)

            startActivity(intent)
        }

        button16.setOnClickListener{
            val intent = Intent(this, StratSix::class.java)

            startActivity(intent)
        }

        button17.setOnClickListener{
            val intent = Intent(this, StratSeven::class.java)

            startActivity(intent)


        }
    }
}
