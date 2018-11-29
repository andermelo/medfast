package com.medfest.android.medfestapp.ui.addReceita

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.R.id.*
import com.medfest.android.medfestapp.addReceitaPresenter
import com.medfest.android.medfestapp.common.showGeneralError
import kotlinx.android.synthetic.main.activity_add_receita.*

class AddReceitaActivity : AppCompatActivity(), AddReceitaView {

  private val presenter by lazy { addReceitaPresenter() }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_receita)
    presenter.setView(this)

    initUi()
  }

  private fun initUi() {
    receitaDescription.onTextChanged { presenter.onReceitaTextChanged(it) }
    addReceita.onClick { presenter.addReceitaTapped() }
  }

  override fun showReceitaError() {
    receitaDescription.error = getString(R.string.receita_error)
  }

  override fun removeReceitaError() {
    receitaDescription.error = null
  }

  override fun onReceitaAdded() = finish()

  override fun showAddReceitaError() = showGeneralError(this)
}