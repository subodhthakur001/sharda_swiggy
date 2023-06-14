package org.example;

public class Restaurant {
       String name;
       String cuisine;
       Dishes[] dish;
       float ratings;
       Menu[] menu;
       public Restaurant(String name, String cuisine, Dishes[] dish, float ratings, Menu[] menu){
           this.name = name;
           this.cuisine = cuisine;
           dish = new Dishes[3];
           this.ratings = ratings;
           menu = new Menu[3];
       }

}

