package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.ui.login.LoginView

interface LoginPresenter : BasePresenter<LoginView> {

  fun onLoginTapped()

  fun onEmailChanged(email: String)

  fun onPasswordChanged(password: String)
}