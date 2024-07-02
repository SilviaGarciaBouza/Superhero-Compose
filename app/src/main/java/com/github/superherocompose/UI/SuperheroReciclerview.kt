package com.github.superherocompose.UI

import android.graphics.drawable.PaintDrawable
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.superherocompose.R
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontLoadingStrategy.Companion.Async
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.github.superherocompose.MainActivity
import com.github.superherocompose.Routes
import com.github.superherocompose.data.SuperheroItemResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.*
import org.jetbrains.annotations.Async
import coil.compose.AsyncImage




//class SuperheroItemResponse(val sHName: String, @DrawableRes var sHImage: Int, val shID: Int)
//val mySuperheroList: List<SuperheroItem> = listOf(SuperheroItem("Superman",  R.drawable.ic_launcher_foreground, 1), SuperheroItem("Catwoman",  R.drawable.ic_launcher_background, 2))


@Composable
fun ItemSuperHero(navigationControler: NavHostController, superheroItem: SuperheroItemResponse, onClickItem: (SuperheroItemResponse) -> Unit) {

    Card(
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .clickable { onClickItem(superheroItem) }
            .width(200.dp)
            .padding(top = 8.dp, bottom = 8.dp, end = 8.dp, start = 8.dp)) {
        /** Column(modifier = Modifier) {

        AsyncImage(
        model = superheroItem.imageSuperhero,
        contentDescription = "superhero image",
        contentScale = ContentScale.Crop
        )


        Image(painter = superheroItem.imageSuperhero, contentDescription = )
        Text(text = superheroItem.nameSuperhero, modifier = Modifier.align(Alignment.CenterHorizontally))
        }*/
        Column() {

            AsyncImage(
                model = superheroItem.imageSuperhero.urlSuperhero,
                contentDescription = "superhero image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superheroItem.nameSuperhero,
                modifier = Modifier
                    .padding(4.dp)
                    .align(alignment = Alignment.CenterHorizontally),

                fontSize = 22.sp,
                maxLines = 1,
                color = Color.Black
            )
        }
    }
}






        @OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SuperheroReciclerview(navigationControler:NavHostController) {


    val context = LocalContext.current
    val viewModel = SuperheroViewModel()
    Column {


        TopAppBar(modifier = Modifier.fillMaxWidth(),
            title = {
                Text(textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    text = "Superhero List",

                )
            },


        )
        //fixed el nº de columnas, .Adptive(80.dp) si lo quieres por medida
        LazyVerticalGrid(columns = GridCells.Fixed(2), content = {
            items(viewModel.callSuperheroList()) {
                //En el {} lo q quieres q haga al clicar
                ItemSuperHero(navigationControler,
                    superheroItem = it,
                    { navigationControler.navigate(Routes.ScreemItem.createRoute(id = it.idSuperhero)) })
            }
            //contentOaddings es el margen en los bordes
        }, contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp))


    }
}

