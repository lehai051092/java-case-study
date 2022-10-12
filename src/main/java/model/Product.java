package model;

import java.io.Serializable;

public class Product implements Serializable {
    private final String sku;
    private String name;
    private String brand;
    private int price;

    public Product(String sku, String name, String brand, int price) {
        this.sku = sku;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Product {" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                "} \n";
    }
}
