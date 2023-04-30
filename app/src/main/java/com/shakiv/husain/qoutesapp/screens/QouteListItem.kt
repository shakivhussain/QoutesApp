package com.shakiv.husain.qoutesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shakiv.husain.qoutesapp.R


@Composable
fun QouteListItem() {

    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(10.dp)
    ) {

        Row(
            modifier = Modifier.padding(16.dp),

            ) {


            Image(
//                imageVector = Icons.Outlined.FormatQuote,
                painter = painterResource(id = R.drawable.ic_quote),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "PlaceHolder",
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180f)
                    .background(Color.Black)
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Column(modifier = Modifier.weight(1F)) {

                Text(
                    text = "Time is the most valuable thing a man can spend.",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 4.dp)
                )
                Box(
                    modifier =
                    Modifier
                        .background(Color(0xFFBBBABA))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )

                Text(
                    text = "Shakiv Husain",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp)
                )


            }

        }


    }

}


@Preview
@Composable
fun QouteDetails() {


    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(Color(0xFFF0E2E2), Color(0xFFE7E7E7))
                )
            )
    ) {

        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(32.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(16.dp, 24.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_quote),
                    contentDescription = "Qoute",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )

                Text(
                    text = "Time is the most valuable thing in the world.",
                    fontFamily = FontFamily(Font(R.font.regular)),
                    style = MaterialTheme.typography.titleSmall
                )


                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "The description of Text",
                    fontFamily = FontFamily(Font(R.font.regular)),
                    style = MaterialTheme.typography.bodySmall
                )

            }

        }
    }
}