package com.lateinlabs.spotifryer

import com.lateinlabs.spotifryer.BuildConfig
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var albumArtImageView: ImageView
    private val CLIENT_ID = BuildConfig.SPOTIFY_CLIENT_ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is the only line you really need in onCreate for now.
        // It connects your code to your XML layout file.
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()                             // 'super' für Elternklasse aufrufen

        /*
        override fun onConnected(){
            connected()
        }
         */

    }

    override fun onStop(){
        super.onStop()
    }

    private fun connected(){

    }
}