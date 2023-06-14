package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restro {

    String restroId;
    String name;

    public ArrayList<Dish> dishes;
    public Restro(String restroId, String name){
        this.restroId = restroId;
        this.name = name;
        dishes = new ArrayList<>();
    }
    public String getRestroId() {
        return restroId;
    }

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addDishes(String restid, String dishid, String name, int price){
        Dish d1 = new Dish(restid, dishid, name, price);
        dishes.add(d1);
    }
    @Override
    public String toString() {
        return "" +
                "restroId='" + restroId + '\'' +
                ", name='" + name + '\'' +
                "";
    }

}
