package com.practice.geeksforgeeks.dsa.arrays;

import java.util.Arrays;

public class DeletionOperation {

    public static void main(String[] args) {

        performDeletion();

    }

    private static void performDeletion() {

        int[] arr = {1,2,3,4,5};

        //Item to be deleted.
        int itemToBeDeleted = 3;
        int[] newArr = new int[arr.length - 1];

        //How to delete the item present at the location 3 here?
        int indexForSecondArray = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i == itemToBeDeleted) {
                continue;
            }
            //Count check for second array?

            System.out.println("Current item: " + arr[i]);
            newArr[indexForSecondArray] = arr[i];
            indexForSecondArray++;
        }

        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr.length);
    }

}
