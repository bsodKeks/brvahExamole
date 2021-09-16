package com.als.myapplication.data.dto

import com.chad.library.adapter.base.entity.MultiItemEntity

data class MessageDTO(
    val text: String,
    val price: String,
    val image: String,
    val mayAgreement: Boolean = false,
    val type: Int = typeNotPremium
) : MultiItemEntity {
    companion object {
        const val typePremium = 0
        const val typeNotPremium = 1
    }

    override val itemType: Int
        get() = this.type
}
