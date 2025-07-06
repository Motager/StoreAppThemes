package org.motager.storethemes.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import org.motager.storethemes.app.navigation.NavigationGraph

@Composable
fun App(){
    val navController = rememberNavController()
    NavigationGraph(navController = navController)
}