package com.dstore.expensetracker.ui.navigations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dstore.expensetracker.ui.pages.onboarding.OnboardingScreen

@Composable
fun AppNavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.OnboardingScreen.route,
){
    NavHost(navController=navController, startDestination = startDestination, modifier = modifier){
        composable(NavigationItem.OnboardingScreen.route) {
            OnboardingScreen(modifier = Modifier.padding(10.dp))
        }
        composable(NavigationItem.PinScreen.route) {
            Column {
                Text("Login Page")
                Text("PIn screen actually")
            }
        }
    }
}
@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}
