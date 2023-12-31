package com.example.openweatherproject.API

object Common
{
    private val BASE_URL = "https://api.openweathermap.org/data/2.5/"
    val retrofitService: APIWeather
        get() = RetrofitClient.getClient(BASE_URL).create(APIWeather::class.java)
}