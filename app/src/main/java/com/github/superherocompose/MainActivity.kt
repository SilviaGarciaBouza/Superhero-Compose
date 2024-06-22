package com.github.superherocompose

import android.app.FragmentManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.github.superherocompose.UI.*
import com.github.superherocompose.UI.SuperheroItemScreem
import com.github.superherocompose.ui.theme.SuperheroComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = Routes.ScreemRV.route){
                        composable(Routes.ScreemRV.route){ SuperheroReciclerview(navigationController) }
                        composable(Routes.ScreemItem.route,
                            arguments = listOf(navArgument("id"){type= NavType.IntType})
                        ){backStackEntry ->
                            SuperheroItemScreem(
                                navigationController,
                                backStackEntry.arguments?.getInt("id" ) ?: 1
                            )}

                      }

                      }
                    }
                }
            }
        }





//Crea navigation $mysuperheroList es la lista q le pasas en los items
sealed class Routes(val route: String){
    object ScreemRV: Routes("screemRV")

    object ScreemItem: Routes("ScreemItem/{id}"){
        fun createRoute(id: Int) = "ScreemItem/$id"
    }
}