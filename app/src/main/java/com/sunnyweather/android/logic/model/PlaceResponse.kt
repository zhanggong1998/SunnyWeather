package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String,val places:List<place>)
data class place(val name:String, val location: Location,
    @SerializedName("formatted_address") val adress:String)
data class Location(val lng:String,val lat:String)