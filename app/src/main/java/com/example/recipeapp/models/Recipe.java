package com.example.recipeapp.models;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

        private int id;
        private String title;
        private String image;
        private String imageType;
        private int usedIngredientCount;
        private int missedIngredientCount;
        private ArrayList<Ingredient> missedIngredients;
        private ArrayList<Ingredient> usedIngredients;
        private ArrayList<Ingredient> unusedIngredients;
        private int likes;



        // Getters and Setters for all the fields

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getMissedIngredientCount() {
            return missedIngredientCount;
        }

        public void setMissedIngredientCount(int missedIngredientCount) {
            this.missedIngredientCount = missedIngredientCount;
        }

        public List<Ingredient> getMissedIngredients() {
            return missedIngredients;
        }

        public void setMissedIngredients(ArrayList<Ingredient> missedIngredients) {
            this.missedIngredients = missedIngredients;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Ingredient> getUnusedIngredients() {
            return unusedIngredients;
        }

        public void setUnusedIngredients(ArrayList<Ingredient> unusedIngredients) {
            this.unusedIngredients = unusedIngredients;
        }

        public int getUsedIngredientCount() {
            return usedIngredientCount;
        }

        public void setUsedIngredientCount(int usedIngredientCount) {
            this.usedIngredientCount = usedIngredientCount;
        }

        public List<Ingredient> getUsedIngredients() {
            return usedIngredients;
        }

        public void setUsedIngredients(ArrayList<Ingredient> usedIngredients) {
            this.usedIngredients = usedIngredients;
        }


    }

