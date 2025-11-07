package com.example.navigationcomposeapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Selamat Datang di Home Screen!")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("detail") }) {
                Text("Ke Halaman Detail")
            }
        }
    }
}
