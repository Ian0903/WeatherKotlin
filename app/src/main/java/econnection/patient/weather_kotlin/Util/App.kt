package econnection.patient.weather_kotlin.Util

import android.app.Application
import kotlin.properties.Delegates

class App : Application() {

    companion object {
        var instance : App by Delegates.notNull<App>()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}