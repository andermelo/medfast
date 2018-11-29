package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.ui.addReceita.AddReceitaView

interface AddReceiaPresenter : BasePresenter<AddReceitaView> {

  fun addReceitaTapped()

  fun onReceitaTextChanged(receitaText: String)
}