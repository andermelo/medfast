package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.ui.register.RegisterView

interface RegisterPresenter : BasePresenter<RegisterView> {

  fun onUsernameChanged(username: String)

  fun onEmailChanged(email: String)

  fun onPasswordChanged(password: String)

  fun onRepeatPasswordChanged(repeatPassword: String)

  fun onRegisterTapped()

}