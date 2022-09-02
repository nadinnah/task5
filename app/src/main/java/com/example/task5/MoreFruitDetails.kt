package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MoreFruitDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_fruit_details)

        val fruits= intent.getParcelableExtra<FruitsDetailsActivity>("FRUITS")
        if(fruits != null){
            val textView: TextView= findViewById(R.id.detailedTextView)
            val imageView: ImageView= findViewById(R.id.detailedImageView)
//            textView.text= FruitsDetailsActivity.name
//            ImageView.setImageResource(FruitsDetailsActivity.image)

        }
    }
}