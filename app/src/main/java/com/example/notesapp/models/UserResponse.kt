package com.example.notesapp.models


import androidx.annotation.Keep

@Keep
data class UserResponse(
    val token: String,
    val user: User
)