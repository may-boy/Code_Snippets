package com.practice.geeksforgeeks.dsa.arrays;

public class CheckIfSorted {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 8, 7};

        boolean isSorted = checkIfArraySorted(arr);
        System.out.println("isSorted: " + isSorted);
    }

    private static boolean checkIfArraySorted(int[] arr) {
        //We need not to store the values of the arrays while iteration.
        //Reduce the space consumption by directly comparing the values of the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

}
