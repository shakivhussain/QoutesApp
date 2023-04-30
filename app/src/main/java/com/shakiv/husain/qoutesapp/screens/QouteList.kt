package com.shakiv.husain.qoutesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.shakiv.husain.qoutesapp.model.Quote


@Composable
fun QouteList(quoteList: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    LazyColumn(content = {
        items(quoteList) { qoute ->
            QouteListItem(quote = qoute, onClick)
        }
    })
}