package com.ahmedtikiwa.liam.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ahmedtikiwa.liam.domain.StoreItem
import com.ahmedtikiwa.liam.domain.VideoItem

class LiamRepository {

    private val _storeList = MutableLiveData<List<StoreItem>>()

    val storeList: LiveData<List<StoreItem>>
        get() = _storeList

    private val _videosList = MutableLiveData<List<VideoItem>>()

    val videoList: LiveData<List<VideoItem>>
        get() = _videosList

    fun getMockVideoList() {
        val list = mutableListOf<VideoItem>()
        list.add(
            VideoItem(
                id = 1,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 2,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 3,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 4,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 4,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 5,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )
        list.add(
            VideoItem(
                id = 6,
                name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                price = "L200",
                imageUrl = "https://www.udemy.com/course/drawing-for-kids-how-to-draw-step-by-step-interactive-art/"
            )
        )

        _videosList.postValue(list)
    }

    fun getMockStoreList() {
        val list = mutableListOf<StoreItem>()
        list.add(
            StoreItem(
                id = 1,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )
        list.add(
            StoreItem(
                id = 2,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )
        list.add(
            StoreItem(
                id = 2,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )
        list.add(
            StoreItem(
                id = 3,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )
        list.add(
            StoreItem(
                id = 4,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )
        list.add(
            StoreItem(
                id = 5,
                name = "XBox One X",
                price = "L100",
                type = "Gaming",
                imageUrl = "https://game4u.co.za/wp-content/uploads/2020/02/standalone2.png"
            )
        )

        _storeList.postValue(list)
    }
}