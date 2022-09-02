package com.verkada.android.catpictures

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.verkada.android.catpictures.data.Picture
import com.verkada.android.catpictures.data.PictureResponse
import com.verkada.android.catpictures.network.Network
import com.verkada.android.catpictures.network.PictureService
import com.verkada.android.catpictures.ui.PictureGrid
import kotlinx.coroutines.*

@Composable
fun CatPicturesNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    lateinit var pictures:List<Picture>
    pictures = ArrayList<Picture>()
    NavHost(
        navController = navController,
        startDestination = Screens.Home.name,
        modifier = modifier
    ) {

        composable(route = Screens.Home.name) {
            PictureGrid(10)
        }

        composable(route = Screens.Favorites.name) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(text = "Favorite screen")
            }
        }
    }
}

//@OptIn(DelicateCoroutinesApi::class)
//fun somethingUsefulOneAsync() = GlobalScope.async {
//    Network.service.catPictures().pictures()
//}
// on below line we are creating grid view function for loading our grid view.



enum class Screens {
    Home,
    Favorites
}
