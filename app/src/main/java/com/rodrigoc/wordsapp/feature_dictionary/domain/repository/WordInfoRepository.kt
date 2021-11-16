package com.rodrigoc.wordsapp.feature_dictionary.domain.repository

import com.rodrigoc.wordsapp.core.util.Resource
import com.rodrigoc.wordsapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}