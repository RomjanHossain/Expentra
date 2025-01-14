package com.dstore.expensetracker.ui.navigations

enum class Screen {
    ONBOARDING_SCREEN,
    PIN_SCREEN,
}

sealed class NavigationItem(val route:String){
    data object OnboardingScreen: NavigationItem(Screen.ONBOARDING_SCREEN.name)
    data object PinScreen: NavigationItem(Screen.PIN_SCREEN.name)
}
