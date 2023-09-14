package com.example.openweatherproject.model

import retrofit2.http.GET

interface APIWeather {
    @GET("https://api.openweathermap.org/data/2.5/weather?q=")
    fun getWeather():Weather
}