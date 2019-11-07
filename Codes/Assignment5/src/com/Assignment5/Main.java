package com.Assignment5;

public class Main {

    /**First Question**/
    public static void reverseDisplay(String value){

        if(value.length() == 1){
            System.out.print(value);
            return;
        }
        reverseDisplay(value.substring(1));
        System.out.print(value.charAt(0));
    }
    /*****************************************************/

    /**Second Question**/
    public static String dec2Bin(int value){
        return (value == 0) ? "" : dec2Bin(value/2)+""+(value%2);
    }
    /*****************************************************/

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>First Question<<<<<<<<<<<<<<");
        String str = "This is a reversed string";
        System.out.println(str);
        reverseDisplay(str);
        System.out.println("\n---------------------------------------------\n");
        System.out.println(">>>>>>>>>>>>>>Second Question<<<<<<<<<<<<<<");
        System.out.println(dec2Bin(20));
        System.out.println("---------------------------------------------\n");
    }
}
