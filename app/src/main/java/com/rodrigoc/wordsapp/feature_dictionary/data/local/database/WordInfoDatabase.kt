package com.rodrigoc.wordsapp.feature_dictionary.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rodrigoc.wordsapp.feature_dictionary.data.local.Converters
import com.rodrigoc.wordsapp.feature_dictionary.data.local.dao.WordInfoDao
import com.rodrigoc.wordsapp.feature_dictionary.data.local.entity.WordInfoEntity
import retrofit2.Converter

@Database(
    entities = [WordInfoEntity::class],
    version = 1,
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase: RoomDatabase() {

    abstract val dao: WordInfoDao
}