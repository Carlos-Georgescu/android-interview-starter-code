package com.verkada.android.catpictures.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun PictureGrid(pictures: Int) {
    // on below line we are creating and initializing our array list

//
//    // on below line we are adding data to our list.
//    courseList = courseList + GridModal("Android", R.drawable.android)
//    courseList = courseList + GridModal("JavaScript", R.drawable.js)
//    courseList = courseList + GridModal("Python", R.drawable.python)
//    courseList = courseList + GridModal("C++", R.drawable.c)
//    courseList = courseList + GridModal("C#", R.drawable.csharp)
//    courseList = courseList + GridModal("Java", R.drawable.java)
//    courseList = courseList + GridModal("Node Js", R.drawable.nodejs)

    // on below line we are adding lazy
    // vertical grid for creating a grid view.
    LazyVerticalGrid(
        // on below line we are setting the
        // column count for our grid view.
        columns = GridCells.Fixed(5),
        // on below line we are adding padding
        // from all sides to our grid view.
        modifier = Modifier.padding(10.dp)
    ) {
        // on below line we are displaying our
        // items upto the size of the list.
        items(pictures) {
            // on below line we are creating a
            // card for each item of our grid view.
//            Card(
//                backgroundColor = Color.Green
//                // inside our grid view on below line we are
//                // adding on click for each item of our grid view.
////                onClick = {
//                    // inside on click we are displaying the toast message.
////                    Toast.makeText(
////                        context,
////                        courseList[it].languageName + " selected..",
////                        Toast.LENGTH_SHORT
////                    ).show()
////                },
//
//                // on below line we are adding padding from our all sides.
////                modifier = Modifier.padding(8.dp),
//
//                // on below line we are adding elevation for the card.
//                elevation = 6.dp
//            ) {
            // on below line we are creating a column on below sides.
            Column(
                // on below line we are adding padding
                // padding for our column and filling the max size.
                Modifier
                    .fillMaxSize()
                    .padding(5.dp),

                // on below line we are adding
                // horizontal alignment for our column
                horizontalAlignment = Alignment.CenterHorizontally,

                // on below line we are adding
                // vertical arrangement for our column
                verticalArrangement = Arrangement.Center
            ) {
                // on below line we are creating image for our grid view item.
//                    Image(
//                        // on below line we are specifying the drawable image for our image.
//                        painter = painterResource(id = courseList[it].languageImg),
//
//                        // on below line we are specifying
//                        // content description for our image
//                        contentDescription = "Javascript",
//
//                        // on below line we are setting height
//                        // and width for our image.
//                        modifier = Modifier
//                            .height(60.dp)
//                            .width(60.dp)
//                            .padding(5.dp)
//                    )
                Text("hello")

                // on the below line we are adding a spacer.
                Spacer(modifier = Modifier.height(9.dp))

                // on below line we are creating
                // a text for our grid view item
                Text(
                    // inside the text on below line we are
                    // setting text as the language name
                    // from our modal class.
                    text = "Danish",

                    // on below line we are adding padding
                    // for our text from all sides.
                    modifier = Modifier.padding(4.dp),

                    // on below line we are
                    // adding color for our text
                    color = Color.Black
                )
            }
        }
    }
}