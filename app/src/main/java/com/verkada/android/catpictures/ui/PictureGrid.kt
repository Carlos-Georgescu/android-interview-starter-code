package com.verkada.android.catpictures.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.verkada.android.catpictures.data.Picture

@Composable
fun PictureGrid(pictureList: List<Picture>) {

    LazyColumn() {

    }
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        // on below line we are adding padding
        // from all sides to our grid view.
        modifier = Modifier.padding(10.dp)

    ) {
        item{ EnlargedPicture(picture = pictureList[0], isFav = true)}
        itemsIndexed(items = pictureList) {index, item ->
            SinglePictureInGrid(index = index , picture = item , onClick = {

            } )
        }
    }
}