package com.example.openweatherproject.model

import com.google.gson.annotations.SerializedName

data class Sys (
    @SerializedName("type") var type:Int,
    @SerializedName("id") var id:Int,
    @SerializedName("country") var country:String,
    @SerializedName("sunrise") var sunrise:Long,
    @SerializedName("sunset") var sunset:Long
)