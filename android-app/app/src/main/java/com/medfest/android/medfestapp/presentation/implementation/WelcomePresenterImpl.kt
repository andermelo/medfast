package com.medfest.android.medfestapp.presentation.implementation

import com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface
import com.medfest.android.medfestapp.presentation.WelcomePresenter
import com.medfest.android.medfestapp.ui.welcome.WelcomeView
import javax.inject.Inject

class WelcomePresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface
) : WelcomePresenter {

  private lateinit var view: WelcomeView

  override fun setView(view: WelcomeView) {
    this.view = view
  }

  override fun viewReady() {
    if (authenticationInterface.getUserId().isNotBlank()) {
      view.startMainScreen()
    }
  }
}