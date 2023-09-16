package com.example.openweatherproject.API

import com.example.openweatherproject.model.MainWeather
import com.example.openweatherproject.model.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIWeather {
    @GET("weather")
    fun getWeather(@Query("q") city: String,
                   @Query("appid") appid: String,
                   @Query("units") units: String,
                   @Query("lang") lang: String
                   ): Call<MainWeather>
}