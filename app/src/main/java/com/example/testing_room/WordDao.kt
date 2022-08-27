package com.example.testing_room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Query("select * from wold_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<Word>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert (word: Word)
    @Query("DELETE FROM wold_table ")
    suspend fun deleteAll()
}