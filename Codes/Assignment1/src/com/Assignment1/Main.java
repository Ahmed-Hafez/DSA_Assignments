package com.Assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    /**First Question**/

    private static int[] withoutDuplicates1(int[] a){

        // Using Set Data Structure to remove duplicates.
        // ----------------------------------------------

        // Adding the items to the set data structure
        Set<Integer> hashSet = new HashSet<>();
        for (int item : a) {
            hashSet.add(item);
        }
        int[] b = new int[hashSet.size()]; // The returned array
        int i = 0; // Counter

        // Adding the items without duplicates to the new returned array
        for(int item : hashSet)
            b[i++] = item;

        return b;
    }

    private static int[] withoutDuplicates2(int[] a){

        ArrayList<Integer> list = new ArrayList<>();
        for(int item : a)
            if(!list.contains(item)) list.add(item);

        int[] b = new int[list.size()];
        int i = 0;
        for(Integer item : list)
            b[i++] = item;

        return b;
    }

    /*******************************************************/

    /**Second Question**/

    private static Object[] concatenate(Object[] a, Object[] b){
        Object[] c = new Object[a.length + b.length];
        int i = 0;

        for(Object item : a) c[i++] = item;
        for(Object item : b) c[i++] = item;

        return c;
    }

    /*******************************************************/


    public static void main(String[] args) {

        System.out.println(">>>>>>>>>First Question<<<<<<<<<");

        int[] arr = new int[] {1, 2, 3, 3, 5, 5, 5, 5, 3, 6};
        System.out.print("Original          : ");
        for(int item : arr) System.out.print(item + " ");

        System.out.println();

        System.out.print("withoutDuplicates1: ");
        int[] b = withoutDuplicates1(arr);
        for(int item : b) System.out.print(item + " ");

        System.out.println();

        System.out.print("withoutDuplicates2: ");
        int[] c = withoutDuplicates2(arr);
        for(int item : c) System.out.print(item + " ");

        System.out.println("\n--------------------------------\n");






        System.out.println(">>>>>>>>>Second Question<<<<<<<<<");

        Object[] a1 = new Object[]{0, 1, 2, 3, 4};
        Object[] a2 = new Object[]{5, 6, 7, 8, 9};
        Object[] a3 = concatenate(a1, a2);

        System.out.print("a1 : ");
        for(Object item : a1) System.out.print(item + " ");
        System.out.println();

        System.out.print("a2 : ");
        for(Object item : a2) System.out.print(item + " ");
        System.out.println();

        System.out.print("a3 : ");
        for(Object item : a3) System.out.print(item + " ");
        System.out.println();

        System.out.println("--------------------------------");













        System.out.println(">>>>>>>>>Third Question<<<<<<<<<");

        ManipulateArray mArr1 = new ManipulateArray(true);
        mArr1.insertElement(5);
        mArr1.insertElement(2);
        mArr1.insertElement(7);
        mArr1.insertElement(1);
        mArr1.insertElement(8);
        mArr1.insertElement(4);
        System.out.println("mArr1: " + mArr1.toString());
        mArr1.deleteElement(1);
        mArr1.deleteElement(4);
        System.out.println("mArr1: " + mArr1.toString());

        ManipulateArray mArr2 = new ManipulateArray(false);
        mArr2.insertElement(5);
        mArr2.insertElement(2);
        mArr2.insertElement(7);
        mArr2.insertElement(3);
        mArr2.insertElement(8);
        mArr2.insertElement(4);
        System.out.println("mArr2: " + mArr2.toString());
        mArr2.deleteElement(8);
        mArr2.deleteElement(4);
        System.out.println("mArr2: " + mArr2.toString());

        int[] b1 = new int[]{1, 5, 2, 8, 9, 4};
        ManipulateArray mArr3 = new ManipulateArray(b1, true);
        System.out.println("mArr3: " + mArr3.toString());
        mArr3.insertElement(3);
        System.out.println("mArr3: " + mArr3.toString());

        ManipulateArray mArr4 = new ManipulateArray(b1, false);
        System.out.println("mArr4: " + mArr4.toString());
        mArr4.insertElement(3);
        System.out.println("mArr4: " + mArr4.toString());

        System.out.println("--------------------------------");
    }
}
