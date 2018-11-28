package econnection.patient.weather_kotlin.UI

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import econnection.patient.weather_kotlin.Model.Forecast
import econnection.patient.weather_kotlin.R
import econnection.patient.weather_kotlin.Util.ctx
import kotlinx.android.synthetic.main.item_forecast.view.*
import org.jetbrains.anko.find

class ViewHolder(view : View, val itemClick: (Forecast) -> Unit) : RecyclerView.ViewHolder(view){

    fun bindForecast(forecast : Forecast){
        with(forecast){
            Picasso.with(itemView.ctx).load(iConUrl).into(itemView.icon)
            itemView.date.text = date
            itemView.description.text = description
            itemView.maxTemperature.text = "${high.toString()}"
            itemView.minTemperature.text = "${low.toString()}"
            itemView.setOnClickListener{itemClick(forecast)}
        }
    }
}