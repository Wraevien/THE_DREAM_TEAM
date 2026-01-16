package com.example.thedreamteam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnBersabe).setOnClickListener {
            startActivity(Intent(this, BersabeActivity::class.java))
        }
        findViewById<Button>(R.id.btnBesa).setOnClickListener {
            startActivity(Intent(this, BesaActivity::class.java))
        }
        findViewById<Button>(R.id.btnBiblanias).setOnClickListener {
            startActivity(Intent(this, BiblaniasActivity::class.java))
        }
        findViewById<Button>(R.id.btnBon).setOnClickListener {
            startActivity(Intent(this, BonActivity::class.java))
        }
        findViewById<Button>(R.id.btnBrillante).setOnClickListener {
            startActivity(Intent(this, BrillanteActivity::class.java))
        }
    }
}
