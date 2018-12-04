package econnection.patient.weather_kotlin.Database

import android.database.sqlite.SQLiteDatabase
import econnection.patient.weather_kotlin.Util.App
import org.jetbrains.anko.db.*

class ForecastDbHelper() : ManagedSQLiteOpenHelper(App.instance,ForecastDbHelper.DB_NAME,null,ForecastDbHelper.DB_VERSION){


    override fun onCreate(db: SQLiteDatabase) {
        db.createTable(CityForecastTable.NAME,true,
            CityForecastTable.ID to INTEGER + PRIMARY_KEY,
            CityForecastTable.CITY to TEXT,
            CityForecastTable.COUNTRY to TEXT)

        db.createTable(DayForecastTable.NAME,true,
            DayForecastTable.CITY_ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
            DayForecastTable.DATE to INTEGER,
            DayForecastTable.DESCRIPTION to TEXT,
            DayForecastTable.HIGH to INTEGER,
            DayForecastTable.LOW to INTEGER,
            DayForecastTable.ICON_URL to TEXT,
            DayForecastTable.CITY_ID to INTEGER)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    companion object {
        val DB_NAME = "forecast.db"
        val DB_VERSION = 1
        val instance by lazy {
            ForecastDbHelper()
        }
    }

}

