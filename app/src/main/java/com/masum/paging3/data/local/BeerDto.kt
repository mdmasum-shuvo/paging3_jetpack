package com.masum.paging3.data.local

data class BeerDto(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val first_brewed:String?,
    val image_url:String?
)
