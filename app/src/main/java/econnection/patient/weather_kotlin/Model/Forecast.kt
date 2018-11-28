package econnection.patient.weather_kotlin.Model

import econnection.patient.weather_kotlin.Model.Forecast

data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int,
                       val low: Int,val iConUrl : String)