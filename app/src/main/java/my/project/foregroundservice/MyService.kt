package my.project.foregroundservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService:Service() {

    private lateinit var musicPlayer:MediaPlayer

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        initMusic()
        create
    }

    private fun crateNotificationChannel()


    private fun initMusic() {
        musicPlayer = MediaPlayer.create(this,
            R.raw.mymusic)
        musicPlayer.isLooping = true
        musicPlayer.setVolume(100F, 100F)
    }


}