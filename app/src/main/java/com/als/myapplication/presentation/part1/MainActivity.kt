package com.als.myapplication.presentation.part1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.als.myapplication.R
import com.als.myapplication.data.repository.Repository
import com.als.myapplication.presentation.part2.PartTwoActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private val adapter = NotificationAdapter(mutableListOf())
    private val repository = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.rvNotification)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val btn = findViewById<Button>(R.id.btnNext)
        btn.setOnClickListener {
            startActivity(Intent(this, PartTwoActivity::class.java))
        }
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
        val data = repository.getAllNotImaged()
        adapter.setNewInstance(data)
    }

    override fun onDestroy() {
        super.onDestroy()
        repository.reset()
    }
}
