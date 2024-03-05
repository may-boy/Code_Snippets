package com.practice.geeksforgeeks.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6,7,7};

        removeDuplicates(arr);

        int index = removeDups(arr, 9);
        System.out.println("Index: " + index);
    }

    private static void removeDuplicates(int[] arr) {

        ArrayList<Integer> single = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1])
                continue;

            single.add(arr[i - 1]);
        }

        System.out.println("Arraylist without duplicate values: " + single);

    }


    //This was the efficient method that required maintaining another array
    // to store the values.
    private static int removeDups(int[] arr, int n) {

        int length = arr.length;

        if (length == 0 || length == 1)
            return length;

        int[] temp = new int[length];
        int result = 0;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[result++] = arr[i];
            }
        }

        temp[result++] = arr[length - 1];

        // Copy elements from temp back to original array
        System.arraycopy(temp, 0, arr, 0, length);

        System.out.println("Array after operation: " + Arrays.toString(arr));
        return result;
    }

}
