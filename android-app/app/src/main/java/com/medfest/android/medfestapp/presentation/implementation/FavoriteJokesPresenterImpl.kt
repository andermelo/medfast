/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.medfest.android.medfestapp.presentation.implementation

import com.medfest.android.medfestapp.firebase.authentication.FirebaseAuthenticationInterface
import com.medfest.android.medfestapp.firebase.database.FirebaseDatabaseInterface
import com.medfest.android.medfestapp.model.Joke
import com.medfest.android.medfestapp.presentation.FavoriteJokesPresenter
import com.medfest.android.medfestapp.ui.jokes.favorite.FavoriteView
import javax.inject.Inject

class FavoriteJokesPresenterImpl @Inject constructor(
    private val authenticationInterface: FirebaseAuthenticationInterface,
    private val databaseInterface: FirebaseDatabaseInterface
) : FavoriteJokesPresenter {

  private lateinit var view: FavoriteView

  override fun setView(view: FavoriteView) {
    this.view = view
  }

  override fun getFavoriteJokes() {
    val id = authenticationInterface.getUserId()

    databaseInterface.getFavoriteJokes(id) {
      it.forEach { it.isFavorite = true }

      displayItems(it)
    }
  }

  private fun displayItems(items: List<Joke>) {
    if (items.isEmpty()) {
      view.clearItems()
      view.showNoDataDescription()
    } else {
      view.hideNoDataDescription()
      view.showFavoriteJokes(items)
    }
  }

  override fun onFavoriteButtonTapped(joke: Joke) {
    databaseInterface.changeJokeFavoriteStatus(joke, authenticationInterface.getUserId())
  }
}