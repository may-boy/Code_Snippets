package com.practice.geeksforgeeks.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverseTheGivenArray(arr);

        int[] arr1 = {1, 2, 3, 4, 5};

        swappingApproach(arr1);

    }

    //Better approach in order to reverse larger arrays.
    private static void swappingApproach(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];

            arr[right] = temp;

            //Move indices towards each other.
            left++;
            right--;
        }

        System.out.println("Reversed array using swapping: " + Arrays.toString(arr));
    }

    private static void reverseTheGivenArray(int[] arr) {

        ArrayList<Integer> reversedArr = new ArrayList<>();

        for (int i = arr.length; i > 0; i--) {
            reversedArr.add(i);
        }

        System.out.println("Reversed arr: " + reversedArr);

    }

}
