# 🎵 Spotifryer - Your Simple Android Remote for Spotify 🎵

Spotifryer is a minimalist Android application designed to act as a simple, clean control panel for the Spotify app running on the same device. This app fixes the missing possibility for Android with a low API level to control Spotify. It utilizes the Spotify App Remote SDK to provide basic playback controls and display the currently playing track information.

## 📸 Screenshot

*(Don't forget to add a cool screenshot of your app running on the emulator!)*

![App Screenshot](screenshot.png)

## ✨ Features

*   ✅ **Secure Connection:** Connects safely to the official Spotify app using their official SDK.
*   🎤 **Real-time Info:** Displays the currently playing song title and artist name as they change.
*   🎨 **Beautiful UI:** Features a modern, clean interface with large, readable text.
*   🖼️ **Rounded Album Art:** A sleek, rounded-corner view for the album cover.
*   📊 **Custom Progress Bar:** A custom-styled progress bar that perfectly mimics the Spotify look and feel.
*   🎛️ **Easy Controls:** Big, simple buttons for all the essential actions:
    *   Play / Pause
    *   Next Track
    *   Previous Track

## 🚀 Getting Started

This guide will walk you through setting up and building the Spotifryer project.

### Prerequisites

*   **Android Studio:** A recent version (e.g., "Iguana" 🦎 or newer) is highly recommended.
*   **Spotify Account:** You'll need a **Spotify Premium** account for the App Remote SDK to function correctly.
*   **Android Device/Emulator:** The device must be running **API 21 (Android 5.0 Lollipop) 🍭 or higher**. This is a requirement from the Spotify SDK itself.

### 🛠️ Building the Project

Follow these steps carefully to get the project up and running.

**1. Spotify Developer Dashboard Setup**

First, you need to tell Spotify about your app to get your "keys" (Client ID).

*   Go to the [Spotify Developer Dashboard](https://developer.spotify.com/dashboard) and log in.
*   Click the green **"Create app"** button.
*   Give it a fun name and description.
*   Once created, you will see your **Client ID**. Copy this! 📋
*   Click **"Edit Settings"**.
*   In the **Package name** field, enter: `com.lateinlabs.spotifryer`
*   In the **Redirect URI** field, enter: `spotifryer://callback`
*   Click **"Add"** and then **"Save"**.

**2. Configure Local Credentials**

To keep your Client ID safe, we store it in a local properties file. This file is ignored by version control, so your secrets are safe.

*   In the root directory of your Android Studio project, create a file named `gradle.properties`.
*   Add the following line to this file, pasting your own Client ID:
    ```properties
    SPOTIFY_CLIENT_ID="YOUR_CLIENT_ID_HERE"
    ```

**3. Build and Run!**

You're ready to go! The project is configured to read your credentials and connect.

*   Open the project in Android Studio.
*   Let Gradle sync all the project dependencies.
*   Select your Android Emulator (API 21+) from the device dropdown menu.
*   Click the **Run 'app'** button (the green triangle ▶️).

The first time you run the app, it will ask for your permission to control Spotify. After you agree, it should connect automatically every time!

## 🔮 Future Improvements

This is a great starting point, but the journey isn't over! Here's what's next:

*   **Button Logic:** Make the Play/Pause, Next, and Previous buttons actually control the music!
*   **Dynamic Button State:** Change the "PLAY" icon/text to "PAUSE" when a song is playing.
*   **Display Album Art:** Use the `ImagesApi` to fetch and display the real album cover.
*   **Live Progress Bar:** Animate our custom progress bar to show the song's real-time playback position.

✨AI-generated file

*This app at in its early state of development, so some things might not work properly*
