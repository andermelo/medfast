package com.medfest.android.medfestapp.firebase.database

import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.model.User

interface FirebaseDatabaseInterface {

  fun listenToReceitas(onResult: (Receita) -> Unit)

  fun addNewReceita(receita: Receita, onResult: (Boolean) -> Unit)

  fun getFavoriteReceitas(userId: String, onResult: (List<Receita>) -> Unit)

  fun changeReceitaFavoriteStatus(receita: Receita, userId: String)

  fun createUser(id: String, name: String, email: String)

  fun getProfile(id: String, onResult: (User) -> Unit)
}