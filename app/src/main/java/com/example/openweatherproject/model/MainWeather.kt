package com.example.openweatherproject.model

import com.google.gson.annotations.SerializedName

data class MainWeather(
    @SerializedName("coord") var coord:Coord,
    @SerializedName("weather") var weather:Array<Weather>,
    @SerializedName("stations") var stations:String,
    @SerializedName("main") var main:Main,
    @SerializedName("visibility") var visibility:Int,
    @SerializedName("wind") var wind:Wind,
    @SerializedName("clouds") var clouds:Clouds,
    @SerializedName("dt") var dt:Int,
    @SerializedName("sys") var sys:Sys,
    @SerializedName("timezone") var timezone:Int,
    @SerializedName("id") var id:Int,
    @SerializedName("name") var name:String,
    @SerializedName("cod") var cod:Int
)