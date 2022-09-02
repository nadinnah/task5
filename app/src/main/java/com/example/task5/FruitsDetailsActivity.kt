package com.example.task5

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
 data class FruitsDetailsActivity(
    val fruitName: String,
    val fruitImage: Int
) : Parcelable {
}
//more details ex: colour and benefits of fruits