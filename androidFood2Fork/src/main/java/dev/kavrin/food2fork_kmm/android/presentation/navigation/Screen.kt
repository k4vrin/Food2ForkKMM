package dev.kavrin.food2fork_kmm.android.presentation.navigation

sealed class Screen(val route: String) {
    object RecipeList : Screen(route = "recipe_list")
    object RecipeDetail : Screen(route = "recipe_detail/{recipe_id}") {
        fun passArguments(id: Int): String {
            return "recipe_detail/${id}"
        }
    }
}
