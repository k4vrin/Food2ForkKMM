package dev.kavrin.food2fork_kmm.android.presentation.recipe_list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RecipeListScreen(
    onSelectedRecipe: (id: Int) -> Unit,
) {
    LazyColumn(
        modifier = Modifier
            .background(Color.White)
    ) {
        items(100) { recipeId ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelectedRecipe(recipeId) }
            ) {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "RecipeId = ${recipeId}"
                )
            }
        }
    }
}