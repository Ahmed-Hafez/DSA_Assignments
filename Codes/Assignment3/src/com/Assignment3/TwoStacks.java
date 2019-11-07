package com.Assignment3;

public class TwoStacks {

    private int capacity;
    private int[] twoStacks;
    private int pnt1, pnt2;
    private int size1, size2;

    public TwoStacks(int capacity){
        this.capacity = capacity;
        twoStacks = new int[capacity];
        pnt1 = 0;
        pnt2 = capacity - 1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize1() {
        return size1;
    }

    public int getSize2() {
        return size2;
    }

    public int getPeek1() {
        return twoStacks[pnt1-1];
    }

    public int getPeek2() {
        return twoStacks[pnt2+1];
    }

    public void push1(int x){
        if(size1 + size2 == capacity)
            throw new RuntimeException("TwoStacks is complete");

        twoStacks[pnt1++] = x;
        size1++;
    }

    public void push2(int x){
        if(size1 + size2 == capacity)
            throw new RuntimeException("TwoStacks is complete");

        twoStacks[pnt2--] = x;
        size2++;
    }

    public void pop1(){
        if(size1 == 0)
            throw new RuntimeException("TwoStacks->firstStack is empty");

        pnt1--;
        size1--;
    }

    public void pop2(){
        if(size1 == capacity-1)
            throw new RuntimeException("TwoStacks->secondStack is empty");

        pnt2++;
        size2--;
    }

    @Override
    public String toString() {
        String ret = "TwoStacks->firstStack: ";
        int i = pnt1-1;
        while(i >= 0)
            ret += twoStacks[i--] + " ";

        ret += "\nTwoStacks->secondStack: ";
        i = pnt2+1;
        while(i < capacity)
            ret += twoStacks[i++] + " ";

        return ret;
    }
}
