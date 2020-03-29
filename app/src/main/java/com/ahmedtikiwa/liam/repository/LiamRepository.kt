package com.ahmedtikiwa.liam.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ahmedtikiwa.liam.domain.StoreItem
import com.ahmedtikiwa.liam.domain.UserDetails
import com.ahmedtikiwa.liam.domain.VideoItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

class LiamRepository {

    private val _storeList = MutableLiveData<List<StoreItem>>()

    val storeList: LiveData<List<StoreItem>>
        get() = _storeList

    private val _videosList = MutableLiveData<List<VideoItem>>()

    val videoList: LiveData<List<VideoItem>>
        get() = _videosList

    private val _userDetails = MutableLiveData<UserDetails>()

    val userDetails: LiveData<UserDetails>
        get() = _userDetails

    suspend fun getMockUserDetails() {
        withContext(Dispatchers.IO) {
            try {
                val userDetails = UserDetails(
                    id = "Ahmed",
                    profileImageUrl = "https://images.unsplash.com/photo-1558981420-87aa9dad1c89?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    totalDownloads = "1000",
                    totalLiams = "L5000",
                    totalLikes = "1500"
                )
                _userDetails.postValue(userDetails)
            } catch (e: Exception) {
                Timber.e(e)
            }
        }
    }

    suspend fun getMockVideoList() {
        withContext(Dispatchers.IO) {
            try {
                val list = mutableListOf<VideoItem>()
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )
                list.add(
                    VideoItem(
                        id = 1,
                        name = "Drawing for Kids: How to Draw Step-by-Step Interactive Art",
                        description = "Hey Friends! Let's Build This Course Together. Send Me Your Artsy Ideas: What Would You Like to Learn to Draw? Ages 5+.",
                        price = "L200",
                        imageUrl = "https://images.unsplash.com/photo-1513542789411-b6a5d4f31634?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80",
                        videoUrl = "S0Q4gqBUs7c"
                    )
                )

                _videosList.postValue(list)
            } catch (e: Exception) {
                Timber.e(e)
            }
        }
    }

    suspend fun getMockStoreList() {
        withContext(Dispatchers.IO) {
            try {
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
            } catch (e: Exception) {
                Timber.e(e)
            }
        }

    }
}