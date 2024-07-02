package com.github.superherocompose.UI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage




@Composable
fun SuperheroItemScreem(navigationControler: NavHostController, id: String){
val viewModel = SuperheroViewModel()
    var sizeFirstStatus by rememberSaveable { mutableStateOf(value = true) }
    val sizeFirstBox = if (sizeFirstStatus){300.dp}else{500.dp}

    val idSuperhero = id.toInt()-1
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp),
        //elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(5.dp, Color.Black)
    ){
        Column (modifier = Modifier
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
            AsyncImage(model = viewModel.callSuperheroItem(idSuperhero.toString() ).imageSuperhero.urlSuperhero, contentDescription = "Superhero image", modifier = Modifier
                .fillMaxWidth()
               // .weight(2f)
                .size(sizeFirstBox)
                .clickable { sizeFirstStatus = !sizeFirstStatus },
                contentScale = ContentScale.Crop)
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
               // .weight(1f)
                .background(Color.Black), Alignment.Center){
                Text(text = viewModel.callSuperheroList().get(idSuperhero).nameSuperhero,
                    color = Color.White, fontSize = 33.sp)
            }
        }

            }

        }

