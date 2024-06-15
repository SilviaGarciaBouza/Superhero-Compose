package com.github.superherocompose.ui.theme

import androidx.navigation.compose.rememberNavController
import com.github.superherocompose.UI.SuperheroItem

class SuperheroNavigation {
    sealed class Routes(val route: String) {
        object Screem1 : Routes("screem1")
        object Screem2 : Routes("screem2?superheroitem={superheroitem}") {
            fun createRoute(superheroItem: SuperheroItem) = "superheroitem=$superheroItem"
        }
    }}
/**

    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = Routes.Screem1.route)
    {
        composable(Routes.Screem1.route) { Routes.Screem1(navigationController) }
        composable(
            Routes.Screem2.route,
            arguments = listOf(navArgument("name") { defaultValue = "S" })
        ) { backStackEntry ->
            Screem6(navigationController, backStackEntry.arguments?.getString("name"))
        }
    }
}}}}*/