package com.example.recipeapp;

import com.example.recipeapp.models.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface RecipeApi {

        @Headers("Content-Type: application/json")
        @GET("recipes/findByIngredients")
        Call<List<Recipe>> getRecipes(
                @Query("apiKey") String apiKey,
                @Query("ingredients") String ingredients,
                @Query("number") String number
        );
}
