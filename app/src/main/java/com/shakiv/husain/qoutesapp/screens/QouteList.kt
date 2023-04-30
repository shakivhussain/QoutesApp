package com.shakiv.husain.qoutesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.shakiv.husain.qoutesapp.model.Qoute


@Composable
fun QouteList(qouteList: Array<Qoute>, onClick: (qoute: Qoute) -> Unit) {

    LazyColumn(content = {
        items(qouteList) { qoute ->
            QouteListItem(qoute = qoute, onClick)
        }
    })
}