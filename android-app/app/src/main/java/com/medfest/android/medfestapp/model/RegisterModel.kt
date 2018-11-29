package com.medfest.android.medfestapp.model

import com.medfest.android.medfestapp.common.arePasswordsSame
import com.medfest.android.medfestapp.common.isEmailValid
import com.medfest.android.medfestapp.common.isUsernameValid

data class RegisterRequest(var name: String = "",
                           var email: String = "",
                           var password: String = "",
                           var repeatPassword: String = "") {

  fun isValid(): Boolean = isUsernameValid(name)
      && isEmailValid(email)
      && arePasswordsSame(password, repeatPassword)
}