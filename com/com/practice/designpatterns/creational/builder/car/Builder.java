package com.practice.designpatterns.creational.builder.car;

public class Builder {

    String make;
    String model;
    int year;
    String color;

    public Builder setMake(String make) {
        this.make = make;
        return this;
    }

    public Builder setModel(String model) {
        this.model = model;
        return this;
    }

    public Builder setYear(int year) {
        this.year = year;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;
    }
}
