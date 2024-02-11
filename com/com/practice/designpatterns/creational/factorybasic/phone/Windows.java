package com.practice.designpatterns.creational.factorybasic.phone;

import com.practice.designpatterns.creational.factorybasic.os.OS;

public class Windows implements OS {
    @Override
    public void specs() {
        System.out.println("Call from Windows...'");
    }
}
