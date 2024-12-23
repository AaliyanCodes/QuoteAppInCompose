package com.example.learningcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import com.example.learningcompose.Models.Quote


@Composable
fun QuoteListItem(quote : Quote, onClick : ()-> Unit){
    Card(    modifier = Modifier.padding(8.dp)
        .clickable{onClick()}
        ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(_root_ide_package_.androidx.compose.ui.graphics.Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "Quote",
                modifier = Modifier
                    .size(40.dp)
//                    .rotate(180f)
                    .background(Color.Black)
                )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
//                    style = MaterialTheme.typography,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp)
                )
                Box(modifier = Modifier
                    .background(Color(0xFFEEEEEE))
                    .fillMaxWidth(.4f)
                    .height(1.dp)
                )
                Text(
                    text = quote.author,
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
        }
    }
}



