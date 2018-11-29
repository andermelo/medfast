package com.medfest.android.medfestapp

import android.app.Application
import com.medfest.android.medfestapp.di.AppComponent
import com.medfest.android.medfestapp.di.DaggerAppComponent

class App : Application() {

  companion object {
    lateinit var instance: App
      private set

    val component: AppComponent by lazy { DaggerAppComponent.builder().build() }
  }

  override fun onCreate() {
    super.onCreate()
    instance = this
  }
}