package com.medfest.android.medfestapp.ui.receitas.all.list

import android.support.v7.widget.RecyclerView
import android.view.View
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.common.onClick
import com.medfest.android.medfestapp.model.Receita
import kotlinx.android.synthetic.main.item_receita.view.*

class ReceitaHolder(
    itemView: View,
    private inline val onFavoriteClickHandler: (Receita) -> Unit
) : RecyclerView.ViewHolder(itemView) {

  fun displayData(receita: Receita) = with(itemView) {
    favoriteButton.onClick { onFavoriteClickHandler(receita) }

    receitaAuthor.text = receita.authorName
    receitaDescription.text = receita.text

    favoriteButton.setImageResource(if(receita.isFavorite) R.drawable.ic_favorite_filled else R.drawable.ic_favorite_border)
  }
}