package com.practice.collections.arraylist;

public class Question16 {

    // 16. How do you synchronize an ArrayList and a LinkedList?
    public static void main(String[] args) throws InterruptedException {

        SynchronizedExample sync = new SynchronizedExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                sync.addSum(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 1001; i <=2000; i++) {
                sync.addSum(i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Synchronized sum: " + sync.getSum());

    }

}

class SynchronizedExample {

    private int sum = 0;

    public synchronized void addSum(int number) {
        sum+=number;
    }

    public synchronized int getSum() {
        return sum;
    }

}
