package com.medfest.android.medfestapp.ui.receitas.favorite

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.favoriteReceitasPresenter
import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.ui.receitas.favorite.list.FavoriteReceitaAdapter
import kotlinx.android.synthetic.main.fragment_receitas.*

class FavoriteReceitasFragment : Fragment(), FavoriteView {


  private val presenter by lazy { favoriteReceitasPresenter() }
  private val adapter by lazy { FavoriteReceitaAdapter(presenter::onFavoriteButtonTapped) }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_receitas, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    presenter.setView(this)
    initUi()
  }

  private fun initUi() {
    receitas.layoutManager = LinearLayoutManager(activity)
    receitas.setHasFixedSize(true)
    receitas.adapter = adapter
  }

  override fun showNoDataDescription() {
    noItems.visibility = View.VISIBLE
  }

  override fun hideNoDataDescription() {
    noItems.visibility = View.GONE
  }

  override fun clearItems() = adapter.clear()

  override fun showFavoriteReceitas(receitas: List<Receita>) = adapter.setData(receitas)
}