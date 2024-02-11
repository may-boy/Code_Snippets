package com.practice.designpatterns.creational.factorybasic.phone;

import com.practice.designpatterns.creational.factorybasic.os.OS;

public class OperatingSystemFactory {

    public OS getInstance(String str) {
        if(str.equalsIgnoreCase("Open"))
            return new Android();
        else if (str.equalsIgnoreCase("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }

}
