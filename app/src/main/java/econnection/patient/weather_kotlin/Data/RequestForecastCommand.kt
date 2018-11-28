package econnection.patient.weather_kotlin.Data

import econnection.patient.weather_kotlin.Model.ForecastList

class RequestForecastCommand(private val zipCode : String) :
    Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDateMapper().convertFromDateModel(forecastRequest.execute())
    }

}