package com.medfest.android.medfestapp.model

import com.medfest.android.medfestapp.common.isEmailValid
import com.medfest.android.medfestapp.common.isPasswordValid

data class LoginRequest(var email: String = "",
                        var password: String = "") {

  fun isValid() = isEmailValid(email) && isPasswordValid(password)
}