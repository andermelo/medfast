package com.medfest.android.medfestapp.presentation

import com.medfest.android.medfestapp.ui.profile.ProfileView

interface ProfilePresenter : BasePresenter<ProfileView> {

  fun getProfile()

  fun logOut()
}