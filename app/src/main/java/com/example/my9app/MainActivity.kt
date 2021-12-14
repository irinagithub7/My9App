package com.example.my9app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var carRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carRecyclerView = findViewById(R.id.car_recycler_view)
        val carList: List<Car> = listOf(
            Car("Ferrari", R.drawable.red_ferrari),
            Car("Fer", R.drawable.blue_ferrari),
            Car("Audi", R.drawable.grey_audi)
        )

        carRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        carRecyclerView.adapter = CarAdapter(carList)
    }
}