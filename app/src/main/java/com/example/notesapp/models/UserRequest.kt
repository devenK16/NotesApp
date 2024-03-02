package com.example.notesapp.models


import androidx.annotation.Keep

@Keep
data class UserRequest(
    val email: String,
    val password: String,
    val username: String
)