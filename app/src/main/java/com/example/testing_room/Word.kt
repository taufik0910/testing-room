package com.example.testing_room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wold_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String) {
}