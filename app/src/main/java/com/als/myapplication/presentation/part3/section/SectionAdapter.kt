package com.als.myapplication.presentation.part3.section

import android.widget.ImageView
import com.als.myapplication.R
import com.als.myapplication.data.dto.NotificationWithSectionsDTO
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseSectionQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class SectionAdapter(data: MutableList<NotificationWithSectionsDTO>) : BaseSectionQuickAdapter<NotificationWithSectionsDTO, BaseViewHolder>(R.layout.item_section_header, R.layout.item_notification_with_image, data) {

    init {
        addChildClickViewIds(R.id.ivState)
    }

    override fun convert(holder: BaseViewHolder, item: NotificationWithSectionsDTO) {
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

    override fun convertHeader(helper: BaseViewHolder, item: NotificationWithSectionsDTO) {
        helper.setText(R.id.tvHeader, item.titleText)
    }
}
