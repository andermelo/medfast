/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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
    receita.layoutManager = LinearLayoutManager(activity)
    receita.setHasFixedSize(true)
    receita.adapter = adapter
  }

  override fun showNoDataDescription() {
    noItems.visibility = View.VISIBLE
  }

  override fun hideNoDataDescription() {
    noItems.visibility = View.GONE
  }

  override fun setFavoriteReceitasIds(favoriteReceitasIds: List<String>) = adapter.setFavoriteReceitasIds(favoriteReceitasIds)
}