package com.medfest.android.medfestapp.di

import com.medfest.android.medfestapp.di.module.PresentationModule
import com.medfest.android.medfestapp.presentation.*
import dagger.Component
import javax.inject.Singleton

@Component(modules = [PresentationModule::class])
@Singleton
interface AppComponent {

  fun registerPresenter(): RegisterPresenter

  fun loginPresenter(): LoginPresenter

  fun allReceitasPresenter(): AllReceitasPresenter

  fun favoriteReceitasPresenter(): FavoriteReceitasPresenter

  fun profilePresenter(): ProfilePresenter

  fun addReceitaPresenter(): AddReceiaPresenter

  fun welcomePresenter(): WelcomePresenter
}