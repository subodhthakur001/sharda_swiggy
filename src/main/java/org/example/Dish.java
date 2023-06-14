package org.example;

public class Dish {
    String restroId;
    String dishId;
    String dishname;
    int price;
    public Dish(String restroId, String dishId, String dishname, int price){
        this.restroId = restroId;
        this.dishId = dishId;
        this.dishname = dishname;
        this.price = price;
    }
    public String getRestroId() {
        return restroId;
    }

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }
    public String getDishId() {
        return dishId;
    }
    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" +
                " dishId='" + dishId + '\'' +
                ", dishname='" + dishname + '\'' +
                ", price=" + price +
                "";
    }
}
