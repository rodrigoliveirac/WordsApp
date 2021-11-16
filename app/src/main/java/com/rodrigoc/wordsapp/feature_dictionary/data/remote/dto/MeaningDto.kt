package com.rodrigoc.wordsapp.feature_dictionary.data.remote.dto

import com.rodrigoc.wordsapp.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String
) {
    fun toMeaning(): Meaning {
        return Meaning(
            definitions = definitions.map { definitionsDto ->
                definitionsDto.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}