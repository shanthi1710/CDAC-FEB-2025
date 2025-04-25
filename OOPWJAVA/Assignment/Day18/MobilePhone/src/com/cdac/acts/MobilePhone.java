package com.cdac.acts;

import java.util.Objects;

public class MobilePhone {
    private String serialNo;
    private String brand;
    private String os;
    private String color;
    private double price;
    private int ram; 
    private double weight; 

    public MobilePhone(String serialNo, String brand, String os, String color, double price, int ram, double weight) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.os = os;
        this.color = color;
        this.price = price;
        this.ram = ram;
        this.weight = weight;
    }

    // Getters and Setters
    public String getSerialNo() {
        return serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "MobilePhone [serialNo=" + serialNo + ", brand=" + brand + ", os=" + os + ", color=" + color + ", price="
                + price + ", ram=" + ram + "GB, weight=" + weight + "g]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MobilePhone other = (MobilePhone) obj;
        return Objects.equals(serialNo, other.serialNo);
    }
}