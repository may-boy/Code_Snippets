package com.practice.designpatterns.creational.factorybasic;

import com.practice.designpatterns.creational.factorybasic.os.OS;
import com.practice.designpatterns.creational.factorybasic.phone.Android;
import com.practice.designpatterns.creational.factorybasic.phone.OperatingSystemFactory;
import com.practice.designpatterns.creational.factorybasic.phone.Windows;

public class FactoryMain {
    public static void main(String[] args) {

        OS obj = new Android();
        obj.specs();

        OS obj1 = new Windows();
        obj1.specs();

        //Getting the object of the classes using the Factory class.
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj2 = operatingSystemFactory.getInstance("Open");
        obj2.specs();
    }
}
