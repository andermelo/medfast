package com.medfest.android.medfestapp.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.medfest.android.medfestapp.R
import com.medfest.android.medfestapp.common.onClick
import com.medfest.android.medfestapp.common.onPageChange
import com.medfest.android.medfestapp.ui.addReceita.AddReceitaActivity
import com.medfest.android.medfestapp.ui.receitas.all.AllReceitasFragment
import com.medfest.android.medfestapp.ui.receitas.favorite.FavoriteReceitasFragment
import com.medfest.android.medfestapp.ui.main.pager.MainPagerAdapter
import com.medfest.android.medfestapp.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  companion object {
    fun getLaunchIntent(from: Context) = Intent(from, MainActivity::class.java).apply {
      addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    initUi()
  }

  private fun initUi() {
    val adapter = MainPagerAdapter(supportFragmentManager)
    adapter.setPages(listOf(AllReceitasFragment(), FavoriteReceitasFragment(), ProfileFragment()))

    mainPager.adapter = adapter
    mainPager.offscreenPageLimit = 3
    bottomNavigation.setOnNavigationItemSelectedListener {
      switchNavigationTab(it.order)
      true
    }

    mainPager.onPageChange { position ->
      val item = bottomNavigation.menu.getItem(position)

      bottomNavigation.selectedItemId = item.itemId
    }

    addReceita.onClick { startActivity(Intent(this, AddReceitaActivity::class.java)) }
  }

  private fun switchNavigationTab(position: Int) = mainPager.setCurrentItem(position, true)
}