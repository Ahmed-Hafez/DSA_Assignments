package com.Assignment4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static Queue reverse (Queue q){
        Queue reversedQueue = new LinkedList();
        Queue clonedQueue = new LinkedList();
        Stack st = new Stack();

        while(!q.isEmpty()){
            clonedQueue.add(q.peek());
            st.push(q.peek());
            q.remove();
        }

        while(!clonedQueue.isEmpty())
            q.add(clonedQueue.remove());

        while(!st.empty())
            reversedQueue.add(st.pop());

        return reversedQueue;
    }

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>First Question<<<<<<<<<<<<<");
        Deque dq = new Deque();
        dq.pushFront(4);
        dq.pushFront(5);
        dq.pushBack(3);
        System.out.println(dq);
        dq.popBack();
        System.out.println(dq);
        dq.popFront();
        System.out.println(dq);
        System.out.println("-------------------------------------------\n");

        System.out.println(">>>>>>>>>>>>>Second Question<<<<<<<<<<<<<");
        Queue q1 = new LinkedList();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println("q1 = " + q1);
        Queue q2 = reverse(q1);
        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("-------------------------------------------\n");

        System.out.println(">>>>>>>>>>>>>Third Question<<<<<<<<<<<<<");
        StackQueues s = new StackQueues();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("-------------------------------------------\n");

        System.out.println(">>>>>>>>>>>>>Fourth Question<<<<<<<<<<<<<");
        QueueStacks q = new QueueStacks();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("-------------------------------------------\n");
    }
}
