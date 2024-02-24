package com.practice.designpatterns.creational.builder.car;

public class Car {

    private final String make;
    private final String model;
    private final int year;
    private final String color;

    Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
