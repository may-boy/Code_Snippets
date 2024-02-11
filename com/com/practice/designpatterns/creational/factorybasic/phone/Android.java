package com.practice.designpatterns.creational.factorybasic.phone;

import com.practice.designpatterns.creational.factorybasic.os.OS;

public class Android implements OS {

    @Override
    public void specs() {

        System.out.println("Most powerful OS: Android");

    }

}
