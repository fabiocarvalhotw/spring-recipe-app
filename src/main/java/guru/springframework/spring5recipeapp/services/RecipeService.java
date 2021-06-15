package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;


public interface RecipeService extends CrudService<Recipe, Long> {
    Set<Recipe> getRecipes();

}
