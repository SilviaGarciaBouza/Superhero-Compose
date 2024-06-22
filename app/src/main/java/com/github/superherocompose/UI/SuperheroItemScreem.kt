package com.github.superherocompose.UI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.github.superherocompose.data.SuperheroItemResponse

@Composable
fun SuperheroItemScreem(navigationControler: NavHostController, id: Int){
val viewModel = SuperheroViewModel()
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        //elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(5.dp, Color.Black)
    ){/**
        Column (modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
            AsyncImage(
                model = viewModel.callSuperheroItem(id),
                contentDescription = "superhero image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )*/
            /**
            AsyncImage(
                model = superheroItem.imageSuperhero,
                contentDescription = "superhero image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column (modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = mySuperheroList.get(id).sHName, modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .background(Color.Black)
                        .fillMaxSize()
                        ,
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )*/
                Text(text = "Hi Worl")
            }

        }

