package com.als.myapplication.data

data class NotificationDTO(
    val date: String,
    val text: String,
    var isRead: Boolean = false
)
