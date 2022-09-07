package com.verkada.android.catpictures.ui

import android.annotation.SuppressLint
import android.content.ClipData
import android.widget.ImageView
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.verkada.android.catpictures.data.Picture

var isFav =  mutableStateOf(false)

@Composable
fun PictureGrid(pictureList: List<Picture>, favPictureList: MutableList<Picture>) {
    var selectedIndex by remember { mutableStateOf( -1)}

    if(pictureList.isEmpty()) Text("List is empty") else
    Column {
        if (selectedIndex != -1) {

            EnlargedPicture(picture = pictureList[selectedIndex], onClickFavIcon = { it.isFav = !it.isFav
                isFav.value = it.isFav
                pictureList[selectedIndex].isFav = it.isFav
           if (it.isFav) favPictureList.add(it) else favPictureList.remove(it) },
                isFav = isFav)
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            // on below line we are adding padding
            // from all sides to our grid view.
            modifier = Modifier.padding(10.dp)

        ) {
            itemsIndexed(items = pictureList) {index, item ->
                SinglePictureInGrid(index = index , picture = item , highlighted =  index == selectedIndex, onClick = {
                    selectedIndex = it
                    isFav.value = pictureList[it].isFav
                } )
            }
        }
    }
}