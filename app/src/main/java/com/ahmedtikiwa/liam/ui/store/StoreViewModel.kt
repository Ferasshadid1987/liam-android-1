package com.ahmedtikiwa.liam.ui.store

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ahmedtikiwa.liam.domain.StoreItem
import com.ahmedtikiwa.liam.repository.LiamRepository
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class StoreViewModel(application: Application) : AndroidViewModel(application) {

    private val viewModelJob = SupervisorJob()

    private val liamRepository = LiamRepository()

    private val _navigateToSelectedStoreItem = MutableLiveData<StoreItem>()

    val navigateToSelectedShow: LiveData<StoreItem>
        get() = _navigateToSelectedStoreItem

    init {
        viewModelScope.launch {
            liamRepository.getMockStoreList()
        }
    }

    val storeList = liamRepository.storeList

    fun displayStoreItemDetail(storeItem: StoreItem) {
        _navigateToSelectedStoreItem.value = storeItem
    }

    fun displayStoreItemDetailComplete() {
        _navigateToSelectedStoreItem.value = null
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}