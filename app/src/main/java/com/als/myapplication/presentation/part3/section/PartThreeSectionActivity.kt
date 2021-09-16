package com.als.myapplication.presentation.part3.section

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.als.myapplication.R
import com.als.myapplication.data.repository.Repository
import com.als.myapplication.presentation.part3.multiItem.PartThreeMultiItemActivity
import com.chad.library.adapter.base.animation.AlphaInAnimation

class PartThreeSectionActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private val adapter = SectionAdapter(mutableListOf())
    private val repository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_three_section)
        val btn = findViewById<Button>(R.id.btnNext)
        btn.setOnClickListener {
            startActivity(Intent(this, PartThreeMultiItemActivity::class.java))
        }
        rv = findViewById(R.id.rvNotification)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        initAdapter()
    }

    private fun initAdapter() {
        rv.adapter = adapter
        adapter.animationEnable = true
        adapter.adapterAnimation = AlphaInAnimation()
        adapter.setOnItemChildClickListener { _, view, position ->
            if (view.id == R.id.ivState) {
                val item = adapter.getItem(position)
                if (!item.isRead) {
                    item.isRead = true
                    adapter.notifyItemChanged(position)
                } else {
                    deleteLocalItem(position)
                }
            }
        }
        val data = repository.getSections()
        adapter.setNewInstance(data)
    }

    private fun deleteLocalItem(position: Int) {
        val item = adapter.getItem(position)
        adapter.remove(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        repository.reset()
    }
}
