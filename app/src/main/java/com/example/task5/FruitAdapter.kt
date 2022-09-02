package com.example.task5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitsList: List<FruitsDetailsActivity>): RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    var onItemClick: ((FruitsDetailsActivity) -> Unit )?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitsView=
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitsView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruits= fruitsList[position]
        holder.bindFruits(currentFruits)
       // holder.itemView.setOnClickListener { onItemClick?.invoke(MainActivity()) }
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    //******************
    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitName: TextView
        private val fruitImage: ImageView
        init {
            fruitName= itemView.findViewById(R.id.mangoName)
            fruitImage= itemView.findViewById(R.id.mangoImage)
            fruitImage.setOnClickListener {
                val currentFruits=fruitsList[layoutPosition]
                val intent= Intent(itemView.context, MoreFruitDetails::class.java)
                intent.putExtra("FRUIT", currentFruits)
                itemView.context.startActivity(intent)
//                Toast.makeText(itemView.context, currentFruits.fruitName, Toast.LENGTH_SHORT).show()
            }
        }
        fun bindFruits(fruit: FruitsDetailsActivity){
            fruitName.text= fruit.fruitName
            fruitImage.setImageResource(fruit.fruitImage)

        }
    }
}