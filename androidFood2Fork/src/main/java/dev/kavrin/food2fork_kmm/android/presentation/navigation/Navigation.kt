package dev.kavrin.food2fork_kmm.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.kavrin.food2fork_kmm.android.presentation.recipe_detail.RecipeDetailScreen
import dev.kavrin.food2fork_kmm.android.presentation.recipe_list.RecipeListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.RecipeList.route
    ) {
        composable(
            route = Screen.RecipeList.route
        ) { navBackStackEntry ->
            RecipeListScreen(
                onSelectedRecipe = { id ->
                    navController.navigate(Screen.RecipeDetail.passArguments(id = id))
                }
            )
        }

        composable(
            route = Screen.RecipeDetail.route,
            arguments = listOf(
                navArgument(name = "recipe_id") {
                    type = NavType.IntType
                }
            )
        ) { navBackStackEntry ->
            RecipeDetailScreen(recipeId = navBackStackEntry.arguments?.getInt("recipe_id"))
        }
    }
}