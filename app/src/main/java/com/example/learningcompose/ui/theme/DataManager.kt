package com.example.learningcompose.ui.theme

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.learningcompose.Models.Quote
import com.example.learningcompose.Pages
import com.google.gson.Gson

object DataManager {
    var currentQuote: Quote? = null
    val currentPage = mutableStateOf(Pages.LISTING)
    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)
    fun loadAssers(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }
    fun switchPages(quote: Quote?){
        if(currentPage.value == Pages.LISTING){
            currentQuote = quote
            currentPage.value = Pages.DETAIL
        }else{
            currentPage.value = Pages.LISTING
        }
    }
}