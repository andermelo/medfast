package com.medfest.android.medfestapp.ui.receitas.all

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.allReceitasPresenter
import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.ui.receitas.all.list.ReceitaAdapter
import kotlinx.android.synthetic.main.fragment_receitas.*

class AllReceitasFragment : Fragment(), AllReceitasView {

  private val presenter by lazy { allReceitasPresenter() }
  private val adapter by lazy { ReceitaAdapter(presenter::onFavoriteButtonTapped) }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_receitas, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initUi()
    presenter.setView(this)

    presenter.viewReady()
  }

  override fun addReceita(receita: Receita) {
    adapter.addReceita(receita)
    noItems.visibility = if (adapter.itemCount!=0) View.INVISIBLE else View.VISIBLE
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

  override fun setFavoriteReceitasIds(favoriteReceitasIds: List<String>) = adapter.setFavoriteReceitasIds(favoriteReceitasIds)
}