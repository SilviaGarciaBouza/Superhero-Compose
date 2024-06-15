package com.github.superherocompose.UI

import android.graphics.drawable.PaintDrawable
import android.widget.ImageView
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.superherocompose.R



class SuperheroItem(val name: String, val image: Int )
val mySuperheroList: List<SuperheroItem> = listOf(SuperheroItem("Superman",  R.drawable.ic_launcher_foreground), SuperheroItem("Catwoman",  R.drawable.ic_launcher_background))

@Composable
fun SuperheroReciclerview() {
    LazyColumn{
        items(mySuperheroList){
            Image(painter = painterResource(id = it.image), contentDescription = "superhero image")
            Text(text = "${it.name}")
        }
    }

}

@Composable
fun SuperheroItemScreem(superheroItem: SuperheroItem){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        //elevation = 12.dp,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(5.dp, Color.Black)
    ){
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
        Image(
            painter = painterResource(id = superheroItem.image),
            contentDescription = "superhero image",
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
        )
        Box(modifier = Modifier.weight(1f)) {
            Column {
                Text(
                    text = superheroItem.name, modifier = Modifier
                        .background(Color.Black)
                        .fillMaxSize().align(Alignment.CenterHorizontally),
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}}
