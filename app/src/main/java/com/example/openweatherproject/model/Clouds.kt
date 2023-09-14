package com.example.openweatherproject.model

import com.google.gson.annotations.SerializedName

data class Clouds (
    @SerializedName("all") var all:Int
)