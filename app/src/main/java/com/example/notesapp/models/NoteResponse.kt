package com.example.notesapp.models


import androidx.annotation.Keep

@Keep
data class NoteResponse(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val description: String,
    val title: String,
    val updatedAt: String,
    val userId: String
)