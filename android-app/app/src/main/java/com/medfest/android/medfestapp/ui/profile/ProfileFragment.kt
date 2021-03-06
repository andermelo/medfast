package com.medfest.android.medfestapp.ui.profile

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.common.onClick
import com.medfest.android.medfestapp.profilePresenter
import com.medfest.android.medfestapp.ui.welcome.WelcomeActivity
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment(), ProfileView {

  private val presenter by lazy { profilePresenter() }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_profile, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    presenter.setView(this)
    initUi()
  }

  private fun initUi() {
    logoutButton.onClick { presenter.logOut() }
  }

  override fun showUsername(username: String) {
    userName.text = getString(R.string.username_text, username)
  }

  override fun showEmail(email: String) {
    userEmail.text = getString(R.string.email_text, email)
  }

  override fun showNumberOfReceitas(receitasCount: Int) {
    numberOfReceitas.text = getString(R.string.number_of_receitas_text, receitasCount)
  }

  override fun openWelcome() {
    startActivity(Intent(activity, WelcomeActivity::class.java))
    activity?.finish()
  }
}