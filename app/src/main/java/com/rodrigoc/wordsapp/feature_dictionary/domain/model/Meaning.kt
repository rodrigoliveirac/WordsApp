package com.rodrigoc.wordsapp.feature_dictionary.domain.model

import com.rodrigoc.wordsapp.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String,
)
