package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.ui.receitas.favorite.FavoriteView

interface FavoriteReceitasPresenter : BasePresenter<FavoriteView> {

  fun getFavoriteReceitas()

  fun onFavoriteButtonTapped(receita: Receita)
}