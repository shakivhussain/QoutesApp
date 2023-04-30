package com.shakiv.husain.qoutesapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.shakiv.husain.qoutesapp.screens.QouteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CoroutineScope(Dispatchers.IO).launch {
            delay(5000)
            DataManager.loadAssets(applicationContext)
        }

        setContent {
            App()
        }
    }
}

@Composable
fun App() {

    if (DataManager.isDataLoaded.value) {
        QouteListScreen(quteList = DataManager.qouteList) {
            Log.d("TAGApp", "App: ")
        }
    } else {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(1F)
        ) {
            Text(
                text = "Loading...",
                style = MaterialTheme.typography.titleMedium)
        }
    }

}