package com.example.tomandjerry

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tomandjerry.ui.screen.AccountScreen
import com.example.tomandjerry.ui.screen.KitchenScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = android.graphics.Color.WHITE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        // enableEdgeToEdge()
        setContent {
         //StoreScreen()
        //  KitchenScreen()
            AccountScreen()
        }
    }
}

