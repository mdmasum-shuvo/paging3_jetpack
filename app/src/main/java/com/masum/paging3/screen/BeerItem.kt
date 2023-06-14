package com.masum.paging3.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.masum.paging3.data.remot.Beer
import com.masum.paging3.ui.theme.Paging3Theme

@Composable
fun BeerItem(beer: Beer, modifier: Modifier = Modifier) {
    
    Card(modifier = modifier, elevation = 4.dp) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(200.dp)) {
            AsyncImage(model =beer.imageUrl, contentDescription = "",modifier=Modifier.weight(1f))
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(3f)) {
                Text(text = beer.name, style = MaterialTheme.typography.h6)
                Text(text = beer.tagline, style = TextStyle(fontSize = 14.sp, color = Color.Gray))
                Text(text = beer.description, style = TextStyle(fontSize = 14.sp))
                beer.firstBrewed?.let { Text(text = it, style = TextStyle(fontSize = 14.sp, color = Color.Gray), textAlign = TextAlign.End) }


            }

        }
    }

}


@Preview
@Composable
fun BeerItemPreview() {
    Paging3Theme {
        BeerItem(
            beer = Beer(
                id = 1,
                name = "beer",
                tagline = "Beer is Cool",
                description = "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a g",
                firstBrewed = "10/12/2022",
                imageUrl = ""
            )
        )
    }
}