package com.masum.paging3.network

import com.masum.paging3.model.BeerEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface BeetApi {

    @GET("beers")
    suspend fun getBeers(@Query("page") page:Int) :List<BeerEntity>

    companion object{
        const val  BASE_URL="https://api.punkapi.com/v2/"
    }
}