package com.example.notesapp.models


import androidx.annotation.Keep

@Keep
data class NoteRequest(
    val description: String,
    val title: String
)