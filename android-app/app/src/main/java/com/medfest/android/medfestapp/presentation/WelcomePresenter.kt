package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.ui.welcome.WelcomeView

interface WelcomePresenter : BasePresenter<WelcomeView> {

  fun viewReady()
}
