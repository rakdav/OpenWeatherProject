package com.example.openweatherproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.openweatherproject.API.APIWeather
import com.example.openweatherproject.API.Common
import com.example.openweatherproject.model.MainWeather
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var service:APIWeather
    private lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.temp)
        service=Common.retrofitService
        service.getWeather("Калининград","443c1c3e63cf5d70eee6cd4cb67513e9",
            "metric","ru").enqueue(object:Callback<MainWeather>{
            override fun onResponse(call: Call<MainWeather>, response: Response<MainWeather>) {
                var weather: MainWeather? =response.body()
                if (weather != null) {
                    text.setText(weather.main.temp.toString())
                }
            }
            override fun onFailure(call: Call<MainWeather>, t: Throwable) {
            }
        })
    }
}