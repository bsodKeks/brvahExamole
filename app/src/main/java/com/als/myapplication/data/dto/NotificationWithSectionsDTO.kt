package com.als.myapplication.data.dto

import com.chad.library.adapter.base.entity.SectionEntity

data class NotificationWithSectionsDTO(
    val date: String = "",
    val text: String = "",
    var isRead: Boolean = false,
    val imageUrl: String = "",
    val titleText: String = "",
) : SectionEntity {
    override val isHeader: Boolean
        get() = titleText.isNotBlank()
}
