package com.medfest.android.medfestapp.ui.receitas.all

import com.medfest.android.medfestapp.model.Receita

interface AllReceitasView {

  fun showNoDataDescription()

  fun hideNoDataDescription()

  fun addReceita(receita: Receita)

  fun setFavoriteReceitasIds(favoriteReceitasIds : List<String>)
}