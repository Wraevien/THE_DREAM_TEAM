package com.example.thedreamteam


import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.android.material.appbar.MaterialToolbar


class BesaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_besa)


        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        toolbar.setNavigationOnClickListener { finish() }
    }
}
