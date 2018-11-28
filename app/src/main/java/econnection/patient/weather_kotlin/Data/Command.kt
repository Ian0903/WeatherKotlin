package econnection.patient.weather_kotlin.Data

public interface Command<T>{

    fun execute() : T
}