package econnection.patient.weather_kotlin.Database

class CityForecast(var map : MutableMap<String,Any?>,
                   var dailyForecast:List<DayForecast>){
    var _id : Long by map
    var city : String by map
    var country : String by map

    constructor(id : Long,city : String,contry:String,
                dailyForecast : List<DayForecast>)
    : this(HashMap(),dailyForecast){
        this._id = id
        this.city = city
        this.country = country
    }
}