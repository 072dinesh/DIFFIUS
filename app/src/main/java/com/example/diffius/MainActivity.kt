package com.example.diffius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = programmingList

        val adapter = ProgrammingAdapter()

        val p1 = programmingItem(1,"J","Java")
        val p2 = programmingItem(2,"K","Kotlin")

        val p3 = programmingItem(3,"P","Python")

        adapter.submitList(listOf(p1,p2,p3))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }
}