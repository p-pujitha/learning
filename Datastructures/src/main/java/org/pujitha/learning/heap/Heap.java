package org.pujitha.learning.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> heap;

    Heap() {
        this.heap = new ArrayList<Integer>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int getLeftChild(int index){
        return 2*index +1;
    }

    private int getRightChild(int index){
        return 2*index + 2;
    }

    private int getParent(int index){
        return (index-1)/2;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size()-1;
        while(heap.get(current) > heap.get(getParent(current)) && current != 0 ){
            swap(current, getParent(current));
            current = getParent(current);
        }
    }

    public Integer remove(){
        if(heap.size() == 0)
            return null;
        if(heap.size() == 1)
            return heap.remove(0);
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }
    public void sinkDown(int index) {
        int maxIndex = index;
        while(true){
            int left = getLeftChild(index);
            int right = getRightChild(index);
            if(left < heap.size() && heap.get(left) > heap.get(maxIndex)){
                maxIndex = left;
            }
            if(right < heap.size() && heap.get(right) > heap.get(maxIndex)){
                maxIndex = right;
            }
            if(maxIndex == index)
                break;
            swap(index, maxIndex);
            index = maxIndex;
        }
    }

}
