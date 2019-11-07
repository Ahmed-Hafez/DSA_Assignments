package com.Assignment6;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    /**First Question**/
    public static void reverseQueue(Queue q){
        if(q.size() == 1) return;
        var obj = q.remove();
        reverseQueue(q);
        q.add(obj);
    }
    /*****************************************************/

    /**Second Question**/
    public static String dec2Bin(int value){
        return (value == 0) ? "" : dec2Bin(value/2)+""+(value%2);
    }
    /*****************************************************/

    /**Third Question**/
    public static String reverseString(String value){
        if(value.length() == 1)
            return value;
        return reverseString(value.substring(1)) + value.charAt(0);
    }
    /*****************************************************/

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>First Question<<<<<<<<<<<<<<");
        Queue q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("q before reversing: " + q);
        reverseQueue(q);
        System.out.println("q after reversing: " + q);
        System.out.println("---------------------------------------------\n");


        System.out.println(">>>>>>>>>>>>>>Second Question<<<<<<<<<<<<<<");
        System.out.println(dec2Bin(20));
        System.out.println("---------------------------------------------\n");


        System.out.println(">>>>>>>>>>>>>>Third Question<<<<<<<<<<<<<<");
        String str = "This is a reversed string";
        System.out.println(str);
        System.out.println(reverseString(str));
        System.out.println("---------------------------------------------\n");

        System.out.println(">>>>>>>>>>>>>>Fourth Question<<<<<<<<<<<<<<");
        System.out.println("a-  O(n-square)");
        System.out.println("b-  O(n-square)");
        System.out.println("c-  O(n*m)");
        System.out.println("d-  O(n/2)");
        System.out.println("e-  O(Math.pow(2, n))");
        System.out.println("f-  O(1)");
        System.out.println("---------------------------------------------\n");
    }
}
