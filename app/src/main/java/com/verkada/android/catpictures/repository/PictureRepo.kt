package com.verkada.android.catpictures.repository

import com.verkada.android.catpictures.data.Picture
import com.verkada.android.catpictures.network.PictureService


class PictureRepo(
    private val pictureService: PictureService
) {
    suspend fun getCatPictures(page: Int = 1):List<Picture> {
        val pictureResponse = pictureService.catPictures(page)
        return pictureResponse.pictures
    }
}