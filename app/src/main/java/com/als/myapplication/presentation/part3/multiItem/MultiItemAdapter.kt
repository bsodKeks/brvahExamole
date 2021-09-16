package com.als.myapplication.presentation.part3.multiItem

import android.widget.ImageView
import com.als.myapplication.R
import com.als.myapplication.data.dto.MessageDTO
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class MultiItemAdapter(data: MutableList<MessageDTO>?) : BaseMultiItemQuickAdapter<MessageDTO, BaseViewHolder>(data) {
    init {
        addItemType(MessageDTO.typeNotPremium, R.layout.item_message)
        addItemType(MessageDTO.typePremium, R.layout.item_mesage_premium)
    }

    override fun convert(holder: BaseViewHolder, item: MessageDTO) {
        val imageView = holder.getView<ImageView>(R.id.ivMsg)
        val context = holder.itemView.context

        Glide.with(context)
            .load(item.image)
            .into(imageView)

        when (holder.itemViewType) {
            MessageDTO.typePremium -> {
                holder.setText(R.id.tvNamePrem, item.text)
                    .setText(R.id.tvPrice, item.price)
                    .setGone(R.id.ivAgreement, !item.mayAgreement)
                    .setGone(R.id.tvAgreement, !item.mayAgreement)
            }
            MessageDTO.typeNotPremium -> {
                holder.setText(R.id.tvName, item.text)
                    .setText(R.id.tvPrice, item.price)
                    .setGone(R.id.ivAgreement, !item.mayAgreement)
                    .setGone(R.id.tvAgreement, !item.mayAgreement)
            }
        }
    }
}
