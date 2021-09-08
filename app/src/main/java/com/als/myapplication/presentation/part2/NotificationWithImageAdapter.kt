package com.als.myapplication.presentation.part2

import android.widget.ImageView
import com.als.myapplication.R
import com.als.myapplication.data.dto.NotificationWithImageDTO
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.LoadMoreModule
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class NotificationWithImageAdapter(data: MutableList<NotificationWithImageDTO>) :
    BaseQuickAdapter<NotificationWithImageDTO, BaseViewHolder>(R.layout.item_notification_with_image, data),
    LoadMoreModule {

    init {
        addChildClickViewIds(R.id.ivState)
    }

    override fun convert(holder: BaseViewHolder, item: NotificationWithImageDTO) {
        holder.setGone(R.id.view, holder.layoutPosition == 0)
            .setText(R.id.tvDateTime, item.date)
            .setText(R.id.tvDsc, item.text)
            .setImageResource(
                R.id.ivState,
                if (item.isRead) R.drawable.ic_delete
                else R.drawable.ic_read
            )

        val imageView = holder.getView<ImageView>(R.id.imageView)
        val context = holder.itemView.context

        Glide.with(context)
            .load(item.imageUrl)
            .circleCrop()
            .into(imageView)
    }
}
