package com.ahmedtikiwa.liam.ui.store

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ahmedtikiwa.liam.repository.LiamRepository
import kotlinx.coroutines.SupervisorJob

class StoreViewModel(application: Application) : AndroidViewModel(application) {

    private val viewModelJob = SupervisorJob()

    private val liamRepository = LiamRepository()

    init {
        liamRepository.getMockVideoList()
    }

    val storeList = liamRepository.storeList

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}