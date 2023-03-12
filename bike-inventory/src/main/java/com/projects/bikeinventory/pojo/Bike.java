package com.projects.bikeinventory.pojo;

import java.util.UUID;

public class Bike {
    
    private String id;
    private String brand;
    private String type;
    private String color;
    private double wheelSize;

    public Bike() {
        this.id = UUID.randomUUID().toString();
    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWheelSize() {
        return wheelSize;
    }
    
    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

}
