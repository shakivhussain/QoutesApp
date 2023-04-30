package com.shakiv.husain.qoutesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.shakiv.husain.qoutesapp.R
import com.shakiv.husain.qoutesapp.model.Quote

@Composable
fun QuoteListScreen(quteList: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    Column {
        Text(
            text = "Quote Application",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(1F),
            style = MaterialTheme.typography.headlineSmall,
            fontFamily = FontFamily(Font(R.font.bold))
        )
        QouteList(quoteList = quteList, onClick)
    }
}