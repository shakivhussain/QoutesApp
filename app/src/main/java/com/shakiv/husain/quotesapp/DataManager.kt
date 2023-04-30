package com.shakiv.husain.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.shakiv.husain.quotesapp.model.Quote
import com.shakiv.husain.quotesapp.screens.Pages

object DataManager {

    var quoteList = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)

    var currentPage = mutableStateOf(Pages.LISTING)
    var currenQuote : Quote?=null

    fun loadAssets(context: Context) {
        val inputStream = context.assets.open("qoutes.json")
        val jsonString = inputStream.bufferedReader().use { it.readText() }
        val gson = Gson()
        quoteList = gson.fromJson(jsonString, Array<Quote>::class.java)
        isDataLoaded.value = true
    }


    fun switchPages(quote: Quote?) {
        if (currentPage.value == Pages.LISTING) {
            currenQuote=quote
            currentPage.value = Pages.DETAILS
        } else {
            currentPage.value = Pages.LISTING
        }
    }
}