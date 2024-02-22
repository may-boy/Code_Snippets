package com.practice.roadmap.sh.gd.serialization;

import java.io.*;

public class SerializationExample {

    private static final String FILE_NAME = "file.ser";

    public static void main(String[] args) {

        performSerializeOperation();
        performDeSerializationOperation();
    }

    private static void performDeSerializationOperation() {

        Demo obj = null;

        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (Demo) ois.readObject();

            System.out.println("\nObject has been DeSerialized.");
            System.out.println(obj.a);
            System.out.println(obj.b);
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Exception occurred while Deserializing the object.");
        }

    }

    private static void performSerializeOperation() {

        Demo obj = new Demo(1, 3);
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Serialize the object.
            oos.writeObject(obj);

            oos.close();
            fos.close();
            System.out.println("Object has been Serialized.");

        } catch (IOException e) {
            System.out.println("Exception occurred while Serializing the object.");
        }

    }

}

class Demo implements Serializable {
    public int a;
    public int b;

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }
}