package com.Assignment4;

import java.util.LinkedList;
import java.util.Queue;

/**Third Question**/

public class StackQueues<T> {

    Queue<T> s1 = new LinkedList<>();
    Queue<T> s2 = new LinkedList<>();

    public void push(T element){
        s1.add(element);
    }
    public T pop(){
        if(s1.isEmpty()) throw new RuntimeException("Stack is empty");
        while(s1.size() != 1)
            s2.add(s1.remove());

        T ret = s1.remove();

        while(!s2.isEmpty())
            s1.add(s2.remove());

        return ret;
    }

}
