package com.medfest.android.medfestapp.presentation

interface BasePresenter<in T> {

  fun setView(view: T)
}