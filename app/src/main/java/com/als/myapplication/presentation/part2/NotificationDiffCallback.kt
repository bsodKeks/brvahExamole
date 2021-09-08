package com.als.myapplication.presentation.part2

import androidx.recyclerview.widget.DiffUtil
import com.als.myapplication.data.dto.NotificationWithImageDTO

class NotificationDiffCallback : DiffUtil.ItemCallback<NotificationWithImageDTO>() {
    override fun areItemsTheSame(oldItem: NotificationWithImageDTO, newItem: NotificationWithImageDTO): Boolean =
        oldItem.text == newItem.text

    override fun areContentsTheSame(oldItem: NotificationWithImageDTO, newItem: NotificationWithImageDTO): Boolean =
        oldItem == newItem
}
