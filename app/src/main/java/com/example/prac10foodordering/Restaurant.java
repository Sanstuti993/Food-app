package com.example.prac10foodordering;

public class Restaurant {
    private int imageResource;
    private String foodName;
    private String price;

    public Restaurant(int imageResource, String foodName, String price) {
        this.imageResource = imageResource;
        this.foodName = foodName;
        this.price = price;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getPrice() {
        return price;
    }
}
