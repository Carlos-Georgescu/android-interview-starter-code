package com.verkada.android.catpictures

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.verkada.android.catpictures.network.Network
import kotlinx.coroutines.launch

class PictureViewModel: ViewModel() {

    fun getCatPictures(page: Int = 1) = viewModelScope.launch{
        Network.service.catPictures(page)
    }
}