package com.shakiv.husain.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.shakiv.husain.quotesapp.model.Quote


@Composable
fun QuoteList(quoteList: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    LazyColumn(content = {
        items(quoteList) { quote ->
            QuoteListItem(quote = quote, onClick)
        }
    })
}