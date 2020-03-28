package com.ahmedtikiwa.liam.ui.videolist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ahmedtikiwa.liam.repository.LiamRepository
import kotlinx.coroutines.SupervisorJob

class VideoListViewModel(application: Application) : AndroidViewModel(application) {

    private val viewModelJob = SupervisorJob()

    private val liamRepository = LiamRepository()

    init {
        liamRepository.getMockVideoList()
    }

    val videoList = liamRepository.videoList

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}