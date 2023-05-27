package com.rakib.Composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.rakib.Composeui.navigation.Navigation
import com.rakib.Composeui.ui.theme.NikeShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNikeShopUIMain()
        }
    }

    @Composable
    fun JetNikeShopUIMain() {
        NikeShopTheme {
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }
        }
    }
}

