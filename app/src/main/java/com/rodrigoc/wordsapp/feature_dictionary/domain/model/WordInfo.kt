package com.rodrigoc.wordsapp.feature_dictionary.domain.model

import com.rodrigoc.wordsapp.feature_dictionary.data.remote.dto.MeaningDto

data class WordInfo(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
)
