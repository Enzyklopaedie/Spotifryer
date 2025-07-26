package com.lateinlabs.spotifryer

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.spotify.android.appremote.api.ConnectionParams
import com.spotify.android.appremote.api.Connector
import com.spotify.android.appremote.api.SpotifyAppRemote

class MainActivity : AppCompatActivity() {

    private lateinit var albumArtImageView: ImageView
    private lateinit var songTitleTextView: TextView
    private lateinit var artistNameTextView: TextView
    private lateinit var playPauseButton: Button
    private lateinit var previousButton: Button
    private lateinit var nextButton: Button

    private val CLIENT_ID = BuildConfig.SPOTIFY_CLIENT_ID
    private val REDIRECT_URI = "spotifryer://callback"
    private var spotifyAppRemote: SpotifyAppRemote? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        albumArtImageView = findViewById(R.id.image_album_art)
        songTitleTextView = findViewById(R.id.text_song_title)
        artistNameTextView = findViewById(R.id.text_artist_name)
        playPauseButton = findViewById(R.id.button_play_pause)
        previousButton = findViewById(R.id.button_previous)
        nextButton = findViewById(R.id.button_next)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        }
    }

    private fun connected() {
    }
