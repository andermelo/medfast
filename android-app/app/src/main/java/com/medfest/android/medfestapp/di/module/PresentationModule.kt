package com.medfest.android.medfestapp.di.module

import com.medfest.android.medfestapp.presentation.*
import com.medfest.android.medfestapp.presentation.implementation.*
import dagger.Binds
import dagger.Module

@Module(includes = [InteractionModule::class])
abstract class PresentationModule {

  @Binds
  abstract fun loginPresenter(loginPresenter: LoginPresenterImpl): LoginPresenter

  @Binds
  abstract fun registerPresenter(registerPresenter: RegisterPresenterImpl): RegisterPresenter

  @Binds
  abstract fun allReceitasPresenter(allReceitasPresenterImpl: AllReceitasPresenterImpl): AllReceitasPresenter

  @Binds
  abstract fun favoriteReceitasPresenter(favoriteReceitasPresenterImpl: FavoriteReceitasPresenterImpl): FavoriteReceitasPresenter

  @Binds
  abstract fun profilePresenter(profilePresenterImpl: ProfilePresenterImpl): ProfilePresenter

  @Binds
  abstract fun addReceitaPresenter(addReceitaPresenterImpl: AddReceitaPresenterImpl): AddReceiaPresenter

  @Binds
  abstract fun welcomePresenter(welcomePresenterImpl: WelcomePresenterImpl): WelcomePresenter
}