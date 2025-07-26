package com.lateinlabs.spotifryer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is the only line you really need in onCreate for now.
        // It connects your code to your XML layout file.
        setContentView(R.layout.activity_main)
    }
}