package com.eyenight.pro.eyenightpro

import com.parse.Parse
import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(Parse.Configuration.Builder(this)
                .applicationId("1TcAvt0wD6YDxEffIJ7qJtRQvMXzu7")
                .clientKey("XUNfi612hLNdS6V8TTb582YTou8qSX")
                .server("http://eyenight-dev.herokuapp.com/parse")
                .build()
        )
    }
}