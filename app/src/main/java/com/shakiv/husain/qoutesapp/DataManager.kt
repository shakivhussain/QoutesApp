package com.shakiv.husain.qoutesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.shakiv.husain.qoutesapp.model.Qoute
import com.shakiv.husain.qoutesapp.screens.Pages

object DataManager {

    var qouteList = emptyArray<Qoute>()
    var isDataLoaded = mutableStateOf(false)

    var currentPage = mutableStateOf(Pages.LISTING)
    var currenQoute : Qoute?=null

    fun loadAssets(context: Context) {
        val inputStream = context.assets.open("qoutes.json")
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val gson = Gson()
        qouteList = gson.fromJson(jsonString, Array<Qoute>::class.java)
        isDataLoaded.value = true
    }


    fun switchPages(qoute: Qoute?) {
        if (currentPage.value == Pages.LISTING) {
            currenQoute=qoute
            currentPage.value = Pages.DETAILS
        } else {
            currentPage.value = Pages.LISTING
        }
    }
}