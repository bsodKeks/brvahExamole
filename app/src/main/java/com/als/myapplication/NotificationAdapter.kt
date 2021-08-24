package com.als.myapplication

import com.als.myapplication.data.NotificationDTO
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class NotificationAdapter(data: MutableList<NotificationDTO>) :
    BaseQuickAdapter<NotificationDTO, BaseViewHolder>(R.layout.item_notification, data) {

    init {
        addChildClickViewIds(R.id.ivState)
    }

    override fun convert(holder: BaseViewHolder, item: NotificationDTO) {
        holder.setGone(R.id.view, holder.layoutPosition == 0)

        holder.setText(R.id.tvDateTime, item.date)
            .setText(R.id.tvDsc, item.text)
            .setImageResource(
                R.id.ivState,
                if (item.isRead) R.drawable.ic_delete
                else R.drawable.ic_read
            )
    }
}
