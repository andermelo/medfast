package com.medfest.android.medfestapp.presentation.implementation

import com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface
import com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface
import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.presentation.AllReceitasPresenter
import com.medfest.android.medfestapp.ui.receitas.all.AllReceitasView
import javax.inject.Inject

class AllReceitasPresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : AllReceitasPresenter {

  private lateinit var view: AllReceitasView

  override fun setView(view: AllReceitasView) {
    this.view = view
  }

  override fun viewReady() {
    databaseInterface.getFavoriteReceitas(authenticationInterface.getUserId()) { onFavoriteReceitasResult(it) }
    getAllReceitas()
  }

  private fun onFavoriteReceitasResult(favoriteJokes: List<Receita>) = view.setFavoriteReceitasIds(favoriteJokes.map { it.id })

  override fun getAllReceitas() = databaseInterface.listenToReceitas { view.addReceita(it) }

  override fun onFavoriteButtonTapped(receita: Receita) {
    databaseInterface.changeReceitaFavoriteStatus(receita, authenticationInterface.getUserId())
  }
}

