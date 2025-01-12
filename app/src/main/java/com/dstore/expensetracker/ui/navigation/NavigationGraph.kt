//import androidx.compose.runtime.Composable
//import androidx.compose.ui.graphics.BlendMode.Companion.Screen
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//
//@Composable
//fun NavigationGraph(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = Screen.Start.route) {
//        composable(Screen.Start.route) {
//            StartScreen {
//                navController.navigate(Screen.Destination.route) {
//                    // Pop up to the start destination (inclusive)
//                    popUpTo(Screen.Start.route) { inclusive = true }
//                }
//            }
//        }
//        composable(Screen.Destination.route) {
//            DestinationScreen()
//        }
//    }
//}
