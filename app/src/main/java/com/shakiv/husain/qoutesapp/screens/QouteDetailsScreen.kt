package com.shakiv.husain.qoutesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.shakiv.husain.qoutesapp.R
import com.shakiv.husain.qoutesapp.model.Qoute


@Composable
fun QouteDetails(qoute: Qoute) {


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
                    text = qoute.quote,
                    fontFamily = FontFamily(Font(R.font.regular)),
                    style = MaterialTheme.typography.titleSmall
                )


                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = qoute.author,
                    fontFamily = FontFamily(Font(R.font.regular)),
                    style = MaterialTheme.typography.bodySmall
                )

            }

        }
    }
}