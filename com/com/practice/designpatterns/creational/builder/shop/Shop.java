package com.practice.designpatterns.creational.builder.shop;

import com.practice.designpatterns.creational.builder.phone.Phone;
import com.practice.designpatterns.creational.builder.phone.PhoneBuilder;

public class Shop {

    //Builder pattern -> Creational Design Pattern!
    public static void main(String[] args) {

        //Passing the values in the traditional way.
        Phone phone = new Phone("Android", 16, "AMD", 1980121, 3100);
        System.out.println(phone);

        //Using builder class.
        Phone phoneBuilderObj = new PhoneBuilder().setOs("Android").setBattery(1000).getPhone();
        System.out.println("Printing from Builder obj:" + phoneBuilderObj);
    }

}
