package com.dstore.expensetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.dstore.expensetracker.ui.navigations.AppNavigationHost
import com.dstore.expensetracker.ui.pages.onboarding.OnboardingScreen
import com.dstore.expensetracker.ui.theme.ExpenseTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenseTrackerTheme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigationHost(navController = navController)
                }
//                Scaffold(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .wrapContentSize(align = Alignment.Center),
//                ) { innerPadding ->
//                    OnboardingScreen(modifier = Modifier.padding(innerPadding))
//                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OnboardingScreen(modifier = Modifier.padding(10.dp))
}
