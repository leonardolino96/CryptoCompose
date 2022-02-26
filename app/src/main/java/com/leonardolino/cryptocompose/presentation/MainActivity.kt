package com.leonardolino.cryptocompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.leonardolino.cryptocompose.presentation.ui.theme.CryptoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoComposeTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}