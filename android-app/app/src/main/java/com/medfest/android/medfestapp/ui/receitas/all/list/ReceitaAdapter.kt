package com.medfest.android.medfestapp.ui.receitas.all.list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.common.onClick
import com.medfest.android.medfestapp.model.Receita

class ReceitaAdapter(
    private val onFavoriteClickHandler: (Receita) -> Unit
) : RecyclerView.Adapter<ReceitaHolder>() {

  private val items = mutableListOf<Receita>()
  private val favoriteReceitasIds = mutableListOf<String>()

  override fun getItemCount() = items.size

  fun setFavoriteReceitasIds(ids: List<String>) {
    favoriteReceitasIds.clear()
    favoriteReceitasIds.addAll(ids)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitaHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receita, parent, false)


    return ReceitaHolder(view, onFavoriteClickHandler)
  }

  override fun onBindViewHolder(holder: ReceitaHolder, position: Int) {
    val receita = items[position].apply { isFavorite = id in favoriteReceitasIds }

    holder.displayData(receita)
  }

  fun addReceita(receita: Receita) {
    items.add(receita)
    notifyItemInserted(items.size - 1)
  }
}