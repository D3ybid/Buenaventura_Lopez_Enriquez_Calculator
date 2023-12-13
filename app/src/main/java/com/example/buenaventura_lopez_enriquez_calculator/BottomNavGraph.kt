package com.example.buenaventura_lopez_enriquez_calculator

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.buenaventura_lopez_enriquez_calculator.screens.HomeScreen
import com.example.buenaventura_lopez_enriquez_calculator.screens.NumGenScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Calculator.route
    ) {
        composable(route = BottomBarScreen.Calculator.route) {
            HomeScreen()
            CalculatorLabel()
        }
        composable(route = BottomBarScreen.NumberGenerator.route) {
            NumGenScreen()
            NumberGeneratorLabel()
        }
    }
}