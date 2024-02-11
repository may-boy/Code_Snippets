package com.practice.designpatterns.creational.factorybasic.phone;

import com.practice.designpatterns.creational.factorybasic.os.OS;

public class IOS implements OS {

    @Override
    public void specs() {

        System.out.println("Most secure OS: IOS");

    }

}
