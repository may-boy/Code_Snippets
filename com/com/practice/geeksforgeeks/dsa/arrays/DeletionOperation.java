package com.practice.geeksforgeeks.dsa.arrays;

import java.util.Arrays;

public class DeletionOperation {

    public static void main(String[] args) {

        performDeletion();

        //Insert: O(n)
        //Search: O(n) for unsorted.
        //Delete: O(n)

        //Get i'th element: O(1)
        //Update the i'th element: O(1)

        //Insert the element at the end and delete from the end can be done in O(1) time.

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
