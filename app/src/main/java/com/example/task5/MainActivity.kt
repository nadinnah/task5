package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recycleView)

        val listOfFruits= getListOfFruits()
        val fruitAdapter= FruitAdapter(listOfFruits)
        recyclerView.adapter= fruitAdapter
    }
    private fun getListOfFruits(): List<FruitsDetailsActivity>{
        val fruits= mutableListOf<FruitsDetailsActivity>()
        fruits.add(FruitsDetailsActivity("Mango", R.drawable.mango))
        fruits.add(FruitsDetailsActivity("Apples", R.drawable.apple))
        fruits.add(FruitsDetailsActivity("Pineapples", R.drawable.pineapple))
        fruits.add(FruitsDetailsActivity("Plum", R.drawable.plum))
        fruits.add(FruitsDetailsActivity("Dates", R.drawable.dates))
        fruits.add(FruitsDetailsActivity("Grapes", R.drawable.grapes))
        fruits.add(FruitsDetailsActivity("Tomatoes", R.drawable.tomatoes))
        fruits.add(FruitsDetailsActivity("Blueberries", R.drawable.blueberries))
        fruits.add(FruitsDetailsActivity("Bananas", R.drawable.bananas))
        fruits.add(FruitsDetailsActivity("Cranberries", R.drawable.cranberries))
        fruits.add(FruitsDetailsActivity("Strawberries", R.drawable.strawberries))
        fruits.add(FruitsDetailsActivity("Cherries", R.drawable.cherries))
        return fruits
    }
}