package econnection.patient.weather_kotlin.Util

import android.content.Context
import android.os.Build
import android.view.View

val View.ctx : Context
    get() = context

inline fun supportsLollipop(code:() -> Unit){
    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
        code()
    }
}