package com.practice.designpatterns.creational.singleton;

public class Logger {

    private static Logger instance;

    //Private constructor to prevent instantiation from outside.
    private Logger() {

    }

    static Logger getInstanceLazyDCL() {
        //Lazy initialization: Create instance if it doesn't exist.
        if(instance == null)
            synchronized (Logger.class) {
                if(instance == null)
                    instance = new Logger();
            }
        return instance;
    }

    //Eager instantiation.
    private static final Logger instanceEager = new Logger();

    public static Logger getInstanceEager() {
        return instanceEager;
    }

    public static void log(String message) {
        System.out.println("[INFO]" + message);
    }

    //ENUM singleton.
    public enum LoggerEnum {
        INSTANCE;

        public void logEnum(String message) {
            System.out.println("[INFO]: printed from Enum " + message);
        }
    }
}
