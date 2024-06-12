package org.example.entities;

public class UsedProduct extends Product {
    private String manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + manufactureDate + ")";
    }
}
