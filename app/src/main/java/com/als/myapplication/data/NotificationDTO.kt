package com.als.myapplication.data

data class NotificationDTO(
    val date: String,
    val text: String,
    val isRead: Boolean = false
)
