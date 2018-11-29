package com.medfest.android.medfestapp.presentation.implementation

import com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface
import com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface
import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.presentation.FavoriteReceitasPresenter
import com.medfest.android.medfestapp.ui.receitas.favorite.FavoriteView
import javax.inject.Inject

class FavoriteReceitasPresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : FavoriteReceitasPresenter {

  private lateinit var view: FavoriteView

  override fun setView(view: FavoriteView) {
    this.view = view
  }

  override fun getFavoriteReceitas() {
    val id = authenticationInterface.getUserId()

    databaseInterface.getFavoriteReceitas(id) {
      it.forEach { it.isFavorite = true }

      displayItems(it)
    }
  }

  private fun displayItems(items: List<Receita>) {
    if (items.isEmpty()) {
      view.clearItems()
      view.showNoDataDescription()
    } else {
      view.hideNoDataDescription()
      view.showFavoriteReceitas(items)
    }
  }

  override fun onFavoriteButtonTapped(receita: Receita) {
    databaseInterface.changeReceitaFavoriteStatus(receita, authenticationInterface.getUserId())
  }
}