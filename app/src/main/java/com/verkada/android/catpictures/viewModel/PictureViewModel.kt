package com.verkada.android.catpictures.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.verkada.android.catpictures.data.Picture
import com.verkada.android.catpictures.network.Network
import com.verkada.android.catpictures.repository.PictureRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PictureViewModel: ViewModel() {
    var pictureList: List<Picture> by mutableStateOf(listOf())

    fun getPictures(){
        viewModelScope.launch {
            pictureList = Network.service.catPictures().pictures + Network.service.birdPictures().pictures
        }
    }
}