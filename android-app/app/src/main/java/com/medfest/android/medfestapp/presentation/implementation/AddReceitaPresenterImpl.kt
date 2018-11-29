package com.medfest.android.medfestapp.presentation.implementation

import com.medfest.android.medfestapp.common.isValidReceita
import com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface
import com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface
import com.medfest.android.medfestapp.model.Receita
import com.medfest.android.medfestapp.presentation.AddReceiaPresenter
import com.medfest.android.medfestapp.ui.addReceita.AddReceitaView
import javax.inject.Inject

class AddReceitaPresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : AddReceiaPresenter {

  private lateinit var view: AddReceitaView

  private var receitaText = ""

  override fun setView(view: AddReceitaView) {
    this.view = view
  }

  override fun addReceitaTapped() {
    if (isValidReceita(receitaText)) {
      val receita = Receita("", authenticationInterface.getUserName(), authenticationInterface.getUserId(), receitaText)

      databaseInterface.addNewReceita(receita) { onAddReceitaResult(it) }
    }
  }

  override fun onReceitaTextChanged(receitaText: String) {
    this.receitaText = receitaText

    if (!isValidReceita(receitaText)) {
      view.showReceitaError()
    } else {
      view.removeReceitaError()
    }
  }

  private fun onAddReceitaResult(isSuccessful: Boolean) {
    if (isSuccessful) {
      view.onReceitaAdded()
    } else {
      view.showAddReceitaError()
    }
  }
}