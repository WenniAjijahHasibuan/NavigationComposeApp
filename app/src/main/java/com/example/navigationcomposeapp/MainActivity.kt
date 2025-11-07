package com.example.navigationcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.*
import com.example.navigationcomposeapp.ui.HomeScreen
import com.example.navigationcomposeapp.ui.DetailScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Tema Material 3
            MaterialTheme {
                // Controller navigasi
                val navController = rememberNavController()

                // Deklarasi alur navigasi
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {
                    composable("home") {
                        HomeScreen(navController)
                    }
                    composable("detail") {
                        DetailScreen(navController)
                    }
                }
            }
        }
    }
}
