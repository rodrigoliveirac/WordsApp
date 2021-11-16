package com.rodrigoc.wordsapp.feature_dictionary.data.remote.dto

import com.rodrigoc.wordsapp.feature_dictionary.data.local.entity.WordInfoEntity
import com.rodrigoc.wordsapp.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val word: String,
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { meaningDto ->
                meaningDto.toMeaning()
            },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}