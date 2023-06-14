package com.masum.paging3.data

import com.masum.paging3.data.local.BeerDto
import com.masum.paging3.data.local.BeerEntity
import com.masum.paging3.data.remot.Beer


fun BeerDto.toBeerEntity():BeerEntity{
    return BeerEntity(
        id = id,
        name=name,
        tagline=tagline,
        description=description,
        firstBrewed = first_brewed,
        imageUrl =image_url
    )
}

fun BeerEntity.toBeer():Beer{
    return Beer(
     id = id,
     name=name,
     tagline=tagline,
     description=description,
     firstBrewed = firstBrewed,
     imageUrl = imageUrl
    )
}