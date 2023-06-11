package com.masum.paging3.model

data class BeerEntity(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val first_brewed:String?,
    val image_url:String?
)
