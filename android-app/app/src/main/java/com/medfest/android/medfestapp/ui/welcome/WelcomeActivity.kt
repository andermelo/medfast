package com.medfest.android.medfestapp.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.common.onClick
import com.medfest.android.medfestapp.ui.login.LoginActivity
import com.medfest.android.medfestapp.ui.main.MainActivity
import com.medfest.android.medfestapp.ui.register.RegisterActivity
import com.medfest.android.medfestapp.welcomePresenter
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity(), WelcomeView {

  private val presenter by lazy { welcomePresenter() }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_welcome)
    presenter.setView(this)

    presenter.viewReady()

    registerButton.onClick { startActivity(Intent(this, RegisterActivity::class.java)) }
    loginButton.onClick { startActivity(Intent(this, LoginActivity::class.java)) }
  }

  override fun startMainScreen() = startActivity(MainActivity.getLaunchIntent(this))
}
