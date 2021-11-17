package com.rodrigoc.wordsapp.feature_dictionary.presentation

import com.rodrigoc.wordsapp.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
