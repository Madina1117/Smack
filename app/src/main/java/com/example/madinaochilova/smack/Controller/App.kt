package com.example.madinaochilova.smack.Controller

import android.app.Application
import com.example.madinaochilova.smack.Utilities.SharedPrefs

/**
 * Created by madinaochilova on 9/8/17.
 */
class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}