package com.als.myapplication.data.dto

data class NotificationWithImageDTO(
    val date: String,
    val text: String,
    var isRead: Boolean = false,
    val imageUrl: String
)
