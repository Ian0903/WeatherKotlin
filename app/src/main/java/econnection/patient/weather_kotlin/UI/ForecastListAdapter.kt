package econnection.patient.weather_kotlin.UI

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import econnection.patient.weather_kotlin.Model.Forecast
import econnection.patient.weather_kotlin.Model.ForecastList
import econnection.patient.weather_kotlin.R
import econnection.patient.weather_kotlin.Util.ctx
import org.jetbrains.anko.find

class ForecastListAdapter(private val weekForecast : ForecastList,
                          val itemClick : (Forecast) -> Unit) :
    RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent : ViewGroup,viewType : Int) : ViewHolder{
        val view = LayoutInflater.from(parent.ctx).inflate(R.layout.item_forecast,parent,false)
        return ViewHolder(view,itemClick)
    }

    override fun onBindViewHolder(holder : ViewHolder, position : Int){
        holder.bindForecast(weekForecast.dailyForecast[position])
    }

    override fun getItemCount() : Int = weekForecast.dailyForecast.size

}