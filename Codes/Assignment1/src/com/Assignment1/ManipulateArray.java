package com.Assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class ManipulateArray {

    private ArrayList<Integer> manipulatedArray;
    private boolean isSorted;

    public ManipulateArray(boolean isSorted){
        manipulatedArray = new ArrayList<>();
        this.isSorted = isSorted;
    }

    public ManipulateArray(int[] arr, boolean isSorted){
        manipulatedArray = new ArrayList<>();
        for(int item : arr) manipulatedArray.add(item);
        if(isSorted)
            manipulatedArray.sort(Integer::compareTo);
        this.isSorted = isSorted;
    }

    public int getSize() {
        return manipulatedArray.size();
    }

    public boolean isSorted() {
        return isSorted;
    }

    public void insertElement(int element){
        if(isSorted && getSize() != 0){
            int i = 0;
            for(Integer item : manipulatedArray){
                if(item >= element) break;
                i++;
            }

            manipulatedArray.add(i, element);
        }
        else manipulatedArray.add(element);
    }

    public void deleteElement(int element){
        if(manipulatedArray.contains(element))
            manipulatedArray.remove((Object)element);
    }

    @Override
    public String toString() {
        String ret = "[";
        for(int i = 0; i < getSize() - 1; i++){
            ret += manipulatedArray.get(i).toString() + ", ";
        }
        ret += (manipulatedArray.get(getSize()-1).toString() + "]");
        return ret;
    }
}
