package com.medfest.android.medfestapp.model

data class UserResponse(val id: String = "",
                        val username: String = "",
                        val email: String = "",
                        val favoriteReceitas: List<Receita> = listOf())

data class User(val id: String,
                val username: String,
                val email: String,
                val favoriteReceitas: List<Receita> = listOf())