package com.practice.geeksforgeeks.dsa.arrays;

public class SecondLargestInArray {

    static int[] arr = {10, 23, 45, 39, 4, 37};

    public static void main(String[] args) {

        returnSecondLargest(arr);

    }

    private static void returnSecondLargest(int[] arr) {

        System.out.println("Inside the return SecondLargest Method!");

        int largestElement = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largestElement)
                largestElement = arr[i];
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest number: " + largestElement);
        System.out.println("Second largest: " + secondLargest);

    }

}
