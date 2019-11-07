package com.Assignment3;

import java.util.Stack;

public class Main {

    private static String decimalToBinary(int num){
        Stack<Integer> st = new Stack<>();
        String ret = "";

        while(num != 0){
            st.push(num % 2);
            num /= 2;
        }
        while(!st.empty()){
            ret += st.pop().toString();
        }

        return ret;
    }

    private static String decimalToBase(int num, int base){

        if(base < 2 || base > 16) throw new RuntimeException();

        Stack st = new Stack<>();
        String[] chars = new String[]{"A", "B", "C", "D", "E", "F"};
        String ret = "";

        while(num != 0){
            int reminder = (num % base);
            st.push((reminder < 10) ? reminder : chars[reminder-10]);
            num /= base;
        }
        while(!st.empty()){
            ret += st.pop().toString();
        }

        return ret;
    }


    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>First Question<<<<<<<<<<<<");
        System.out.println(decimalToBinary(44));
        System.out.println(decimalToBase(981686, 16));
        System.out.println(decimalToBase(256, 10));
        System.out.println("--------------------------------------\n");

        System.out.println(">>>>>>>>>>>>Second Question<<<<<<<<<<<<");

        TwoStacks ts = new TwoStacks(10);
        ts.push1(1);
        ts.push1(2);
        ts.push1(3);
        ts.push1(4);
        ts.push2(5);
        ts.push2(6);
        ts.push2(7);
        ts.push2(8);
        System.out.println(ts);
        System.out.println("peek1: " + ts.getPeek1());
        System.out.println("peek2: " + ts.getPeek2());
        ts.pop1();
        ts.pop2();
        System.out.println("pop1 & pop2");
        System.out.println(ts);
        System.out.println("peek1: " + ts.getPeek1());
        System.out.println("peek2: " + ts.getPeek2());
        System.out.println("--------------------------------------\n");
    }
}
