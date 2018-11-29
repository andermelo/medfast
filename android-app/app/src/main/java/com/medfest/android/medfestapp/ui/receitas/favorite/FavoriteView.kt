package com.medfest.android.medfestapp.ui.receitas.favorite

import com.medfest.android.medfestapp.model.Receita

interface FavoriteView {

  fun showFavoriteReceitas(receita: List<Receita>)

  fun showNoDataDescription()

  fun hideNoDataDescription()

  fun clearItems()
}