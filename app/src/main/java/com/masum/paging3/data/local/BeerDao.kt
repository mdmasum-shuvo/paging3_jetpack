package com.masum.paging3.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface BeerDao {

    @Upsert
    suspend fun updateAll(beers:List<BeerEntity>)

    @Query("Select * FROM beerentity")
    fun pagingSource():PagingSource<Int,BeerEntity>

    @Query("DELETE FROM beerentity")
    suspend fun clearAll()
}