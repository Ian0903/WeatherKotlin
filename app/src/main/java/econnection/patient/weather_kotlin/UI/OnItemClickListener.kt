package econnection.patient.weather_kotlin.UI

import econnection.patient.weather_kotlin.Model.Forecast

interface OnItemClickListener {

    operator fun invoke(forecast : Forecast)
}