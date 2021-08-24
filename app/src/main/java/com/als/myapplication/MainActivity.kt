package com.als.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private val adapter = NotificationAdapter(mutableListOf())
    private val repository = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rvNotification)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        initAdapter()
    }

    private fun initAdapter() {
        rv.adapter = adapter
        adapter.setOnItemChildClickListener { _, view, position ->
            if (view.id == R.id.ivState) {
                val item = adapter.getItem(position)
                if (!item.isRead) {
                    item.isRead = true
                    adapter.notifyItemChanged(position)
                } else {
                    Toast.makeText(this, "Элемент будет удален, реализация в следющей части", Toast.LENGTH_SHORT).show()
                }
            }
        }
        val data = repository.getAll()
        adapter.setNewInstance(data)
    }
}
