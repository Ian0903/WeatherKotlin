package econnection.patient.weather_kotlin.Util

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

object DelegatesExt{

    fun notNullSingleValue<T>(){
        ReadWriteProperty<Any?,T> = NotNullSingleValueVal<T>()
    }
}

private class NotNullSingleValueVal<T>() : ReadWriteProperty<Any?,T>{

    private var value : T? = null

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("not initialized")
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = if (this.value == null) value
        else throw IllegalStateException("already initialized")

    }

}