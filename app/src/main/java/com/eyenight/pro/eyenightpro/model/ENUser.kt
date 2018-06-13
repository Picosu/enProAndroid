package com.eyenight.pro.eyenightpro.model

import com.parse.ParseClassName
import com.parse.ParseObject
import com.parse.ParseUser

@ParseClassName ("_User")
class ENUser : ParseUser() {
    fun getGender(): String {
        return getString("gender")
    }

    fun setGender(gender: String?) {
        put("gender", gender)
    }
}