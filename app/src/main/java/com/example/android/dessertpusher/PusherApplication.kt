package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

//Base class that contains global application state for the entire app
class PusherApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}