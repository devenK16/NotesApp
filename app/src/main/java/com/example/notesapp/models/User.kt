package com.example.notesapp.models


import androidx.annotation.Keep

@Keep
data class User(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val email: String,
    val password: String,
    val updatedAt: String,
    val username: String
)