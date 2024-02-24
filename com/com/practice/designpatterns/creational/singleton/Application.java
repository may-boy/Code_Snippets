package com.practice.designpatterns.creational.singleton;

public class Application {


    public static void main(String[] args) {
        Logger logger = Logger.getInstanceLazyDCL();

        logger.log("Lazy Initialization with Double-Checked Locking");


        //Eager Initialization
        Logger eagerInitialization = Logger.getInstanceEager();
        eagerInitialization.log("Eager initialization");

        // Enum Singleton.
        Logger.LoggerEnum.INSTANCE.logEnum("Enum initialization");
    }
}
