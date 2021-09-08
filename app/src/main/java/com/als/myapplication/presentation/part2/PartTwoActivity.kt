package com.als.myapplication.presentation.part2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.als.myapplication.R
import com.als.myapplication.data.repository.Repository
import java.lang.Exception

class PartTwoActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private val adapter = NotificationWithImageAdapter(mutableListOf())
    private val repository = Repository()
    private val customLoadMoreView = LoadMoreView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_two)
        rv = findViewById(R.id.rvNotification)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        initAdapter()
    }

    private fun initAdapter() {
        rv.adapter = adapter
        adapter.loadMoreModule.loadMoreView = customLoadMoreView
        adapter.loadMoreModule.setOnLoadMoreListener { loadMore() }
        adapter.loadMoreModule.isAutoLoadMore = true
        adapter.setDiffCallback(NotificationDiffCallback())
        adapter.setOnItemChildClickListener { _, view, position ->
            if (view.id == R.id.ivState) {
                val item = adapter.getItem(position)
                if (!item.isRead) {
                    item.isRead = true
                    adapter.notifyItemChanged(position)
                } else {
//                    deleteLocalItem(position)
                    deleteRemoteItem(position)
                }
            }
        }
        val data = repository.firstPage()
        adapter.setNewInstance(data)
    }

    private fun deleteLocalItem(position: Int) {
        val item = adapter.getItem(position)
        adapter.remove(item)
    }

    private fun deleteRemoteItem(position: Int) {
        val data = repository.deleteImagedItem(position)
        adapter.setDiffNewData(data)
    }

    private fun loadMore() {
        try {
            val data = repository.nextPage()
            adapter.addData(data)
            adapter.loadMoreModule.isEnableLoadMore = true
            adapter.loadMoreModule.loadMoreComplete()
            if (repository.isEnd()) {
                adapter.loadMoreModule.loadMoreEnd()
            }
        } catch (e: Exception) {
            adapter.loadMoreModule.loadMoreFail()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        repository.reset()
    }
}
