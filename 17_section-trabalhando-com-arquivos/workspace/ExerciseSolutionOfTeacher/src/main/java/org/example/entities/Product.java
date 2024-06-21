package org.example.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double value, Integer amount) {
        this.name = name;
        this.price = value;
        this.quantity = amount;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double total() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return name + "," + price + "," + quantity;
    }
}
