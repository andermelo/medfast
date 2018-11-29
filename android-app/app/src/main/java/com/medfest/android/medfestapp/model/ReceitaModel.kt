package com.medfest.android.medfestapp.model

data class ReceitaResponse(val id: String = "",
                        val authorName: String = "",
                        val authorId: String = "",
                        val text: String = "")

fun ReceitaResponse.isValid() = id.isNotBlank()
    && authorName.isNotBlank()
    && authorId.isNotBlank()
    && text.isNotBlank()

fun ReceitaResponse.mapToReceita() = Receita(id, authorName, authorId, text)

data class Receita(val id: String,
                val authorName: String,
                val authorId: String,
                val text: String,
                var isFavorite: Boolean = false)