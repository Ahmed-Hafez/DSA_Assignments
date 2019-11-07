package com.Assignment4;

import java.util.LinkedList;

/**First Question**/

public class Deque<T> {
    private LinkedList<T> list;

    public Deque(){
        list = new LinkedList<>();
    }

    public void pushBack(T element){
        list.addLast(element);
    }

    public void pushFront(T element){
        list.addFirst(element);
    }

    public T popBack(){
        return list.removeLast();
    }

    public T popFront(){
        return list.removeFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
