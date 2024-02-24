package com.practice.designpatterns.creational.builder.car;

public class Main {

    public static void main(String[] args) {

        Car car = new Builder()
                .setMake("Toyota")
                .setYear(1999)
                .setModel("Premium")
                .setColor("Green")
                .build();


        //Print Car details.

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Color: " + car.getColor());

    }

}
