package com.karnal3.Tutorial17;

public class Product {

    private String name;
    private  double price;
    private int quantity;

    public Product() {
        this.price=0;
        this.name="";
        this.quantity=0;
    }

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





}
