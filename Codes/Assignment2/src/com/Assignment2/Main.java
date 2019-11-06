package com.Assignment2;

import java.util.LinkedList;

public class Main {

    /**First Question**/

    private static LinkedList<Integer> Union(LinkedList<Integer> list1, LinkedList<Integer> list2){
        var l1 = (LinkedList<Integer>)list1.clone();
        var l2 = (LinkedList<Integer>)list2.clone();

        LinkedList<Integer> ret = new LinkedList<>();

        while(!l1.isEmpty() && !l2.isEmpty()){
            if(l1.getFirst().compareTo(l2.getFirst()) == 0){
                ret.addLast(l1.getFirst());
                l1.removeFirst();
                l2.removeFirst();
            }
            else if(l1.getFirst().compareTo(l2.getFirst()) > 0){
                ret.addLast(l2.getFirst());
                l2.removeFirst();
            }
            else{
                ret.addLast(l1.getFirst());
                l1.removeFirst();
            }
        }

        while(!l1.isEmpty()){
            ret.addLast(l1.getFirst());
            l1.removeFirst();
        }

        while(!l2.isEmpty()){
            ret.addLast(l2.getFirst());
            l2.removeFirst();
        }

        return ret;
    }

    /*******************************************************/

    /**Second Question**/

    private static LinkedList<Integer> Intersect(LinkedList<Integer> list1, LinkedList<Integer> list2){
        var l1 = (LinkedList<Integer>)list1.clone();
        var l2 = (LinkedList<Integer>)list2.clone();

        LinkedList<Integer> ret = new LinkedList<>();

        while(!l1.isEmpty() && !l2.isEmpty()){
            if(l1.getFirst().compareTo(l2.getFirst()) == 0){
                ret.addLast(l1.getFirst());
                l1.removeFirst();
                l2.removeFirst();
            }
            else if(l1.getFirst().compareTo(l2.getFirst()) > 0)
                l2.removeFirst();
            else
                l1.removeFirst();
        }

        return ret;
    }


    /*******************************************************/

    public static void main(String[] args) {

        /**First and second questions**/

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(5);

        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        System.out.println("list1        : " + list1);
        System.out.println("list2        : " + list2);

        var list3 = Union(list1, list2);
        System.out.println("Union        : " + list3);

        var list4 = Intersect(list1, list2);
        System.out.println("Intersection : " + list4);

        /*******************************************************/


    }
}
