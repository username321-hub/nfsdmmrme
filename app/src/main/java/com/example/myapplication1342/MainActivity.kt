package com.example.myapplication1342

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.StrictMath.random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = RecyclerViewUsers().apply{
            list = List(1000){users()}
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
class users{
    var name = "abc"
    var state = 123
}