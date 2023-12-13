package com.example.buenaventura_lopez_enriquez_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.buenaventura_lopez_enriquez_calculator.ui.theme.Buenaventura_Lopez_Enriquez_CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Buenaventura_Lopez_Enriquez_CalculatorTheme {
                MainScreen()
            }
        }
    }
}
