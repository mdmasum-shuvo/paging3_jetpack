package com.masum.paging3.data.local

data class BeerEntity(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val firstBrewed:String?,
    val imageUrl:String?
)
