package com.example.learningcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.Models.Quote

@Preview()
@Composable
fun QuotesDetail(quote: Quote) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
//            elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
                .background(Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp, 24.dp)
//                    .align(Alignment.Center)
                    .padding(16.dp,24.dp)
            ) {
                Icon( // Use Icon for Material Icons
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quotes",
                    modifier = Modifier
                        .size(90.dp)
                        .rotate(180F)
                )
                Spacer(Modifier.height(16.dp)) // Spacer before the quote text
                Text(
                    text = quote.quote, // Fixed typo in "valuable"
//
                    style = MaterialTheme.typography.bodyLarge,
//                    textAlign = TextAlign.Center, // Center align text
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(Modifier.height(16.dp)) // Spacer before the author text
                Text(
                    text = quote.author,
//                    fontFamily = FontFamily(Font(R.font.montserrat_regular)), // Correct font resource
                    style = MaterialTheme.typography.bodySmall,
//                    textAlign = TextAlign.Center, // Center align text
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
        }
    }
}