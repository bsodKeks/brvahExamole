package com.als.myapplication.presentation.part3.multiItem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.als.myapplication.R
import com.als.myapplication.data.dto.MessageDTO
import com.als.myapplication.data.repository.Repository
import com.chad.library.adapter.base.animation.* // ktlint-disable no-wildcard-imports
import com.chad.library.adapter.base.listener.GridSpanSizeLookup

class PartThreeMultiItemActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private val adapter = MultiItemAdapter(mutableListOf())
    private val repository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_three)
        rv = findViewById(R.id.rvNotification)
        rv.layoutManager = GridLayoutManager(this, 2)
        initAdapter()
    }

    private fun initAdapter() {
        rv.adapter = adapter
        adapter.animationEnable = true
        adapter.setGridSpanSizeLookup(
            GridSpanSizeLookup { gridLayoutManager, viewType, position ->
                when (viewType) {
                    MessageDTO.typePremium -> 2
                    else -> 1
                }
            }
        )
        adapter.adapterAnimation = AlphaInAnimation()
        val data = repository.getMessages()
        adapter.setNewInstance(data)
    }

    override fun onDestroy() {
        super.onDestroy()
        repository.reset()
    }
}
