package com.example.customerrecyclerview2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.customerrecyclerview2.adapter.RecyclerAdapter
import com.example.customerrecyclerview2.model.RecyclerModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val recyclerModels: MutableList<RecyclerModel> = ArrayList()
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_name)

        // Create data on RecyclerModel
        recyclerModels.apply {
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "book title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
            add(RecyclerModel("My Description #1", "My Memory title", "July 2024"))
        }

        recyclerAdapter = RecyclerAdapter(this, recyclerModels)

        recyclerView.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
