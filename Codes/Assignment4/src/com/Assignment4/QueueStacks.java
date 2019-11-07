package com.Assignment4;

import java.util.Stack;

/**Fourth Question**/

public class QueueStacks<T> {

    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();

    public void enqueue(T x){
        if(s2.empty()){
            s1.push(x);
        }
        else{
            while(!s2.empty()){
                s1.push(s2.peek());
                s2.pop();
            }
            s1.push(x);
        }
    }
    public T dequeue(){
        if(s1.empty() && s2.empty()) throw new RuntimeException("Queue is empty");
        else if(!s2.empty()){
            T v = s2.peek();
            s2.pop() ;
            return v;
        }
        while(!s1.empty()){
            s2.push(s1.peek());
            s1.pop();
        }
        T v = s2.peek();
        s2.pop() ;
        return v;
    }
}
