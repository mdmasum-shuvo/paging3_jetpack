package com.masum.paging3.data.remot

import com.masum.paging3.data.local.BeerDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BeerApi {

    @GET("beers")
    suspend fun getBeers(@Query("page") page:Int  ) :List<BeerDto>

    companion object{
        const val  BASE_URL="https://api.punkapi.com/v2/"
    }
}