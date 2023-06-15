package org.example;
import java.util.ArrayList;
public class Order {
    String restroId;
    String dishId;
    int quantity;


    public Order(String restroId, String dishId, int quantity) {
        this.restroId = restroId;
        this.dishId = dishId;
        this.quantity = quantity;
    }
    public int bill(ArrayList<Restro> restaurant,int totalbill,String restroId, String foodId, int price) {
        for (Restro r : restaurant) {
            if (r.getRestroId().equals(restroId)) {
                for (Dish d : r.dishes) {
                    if (d.getDishId().equals(foodId)) {
                        totalbill = quantity * d.price;
                    }
                }
            }

        }
        return totalbill;
    }
    }

