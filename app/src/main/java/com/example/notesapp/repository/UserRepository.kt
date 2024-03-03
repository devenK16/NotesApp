package com.example.notesapp.repository

import android.util.Log
import com.example.notesapp.api.UserAPI
import com.example.notesapp.models.UserRequest
import com.example.notesapp.utils.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(private val userAPI: UserAPI) {

    suspend fun registerUser( userRequest: UserRequest ){
        val response = userAPI.signUp(userRequest)
        Log.d(TAG , response.body().toString())
    }

    suspend fun loginUser( userRequest: UserRequest ){
        val response = userAPI.signIn(userRequest)
        Log.d(TAG , response.body().toString())
    }
}