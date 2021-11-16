package com.rodrigoc.wordsapp.feature_dictionary.data.repository

import com.rodrigoc.wordsapp.core.util.Resource
import com.rodrigoc.wordsapp.feature_dictionary.data.local.dao.WordInfoDao
import com.rodrigoc.wordsapp.feature_dictionary.data.remote.DictionaryApi
import com.rodrigoc.wordsapp.feature_dictionary.domain.model.WordInfo
import com.rodrigoc.wordsapp.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow

class WordInfoRepositoryImpl(
    private val api: DictionaryApi,
    private val dao: WordInfoDao
): WordInfoRepository {

    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> {

    }
}