package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.place

class PlaceViewModel:ViewModel() {
    private val searchLiveData=MutableLiveData<String>()
    val placeLiveData=Transformations.switchMap(searchLiveData){query->Repository.searchPlaces(query)}
    fun searchPlaces(query:String){
        searchLiveData.value=query
    }
    val placeList=ArrayList<place>()
}