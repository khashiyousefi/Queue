package com.SixLink;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PriorityQueue {
    int[] array;
    int[] copyArray;
    int head = 0;
    int tail = 0;
    int size;
    int count;
    int capacity;
    public PriorityQueue(int capacity){
        array = new int[capacity];
        this.capacity = capacity;
    }
    public void insert(int item){
        int i;
        if (size == array.length)
            reSize();
        if (head == tail){
            array[tail] = item;
            tail++;
            size++;
            return;
        }
        for(i = size-1; i >= 0;i--){
            if (array[i] > item){
                array[i+1] = array[i];
                array[i] = item;
            }else {
                array[i+1] = item;
                size++;
                tail++;
                return;
            }
        }

        if (array[head] == item) {
            tail++;
            size++;
        }
    }

    private void reSize() {
        copyArray = array;
        array = new int[capacity * 2];
        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[i];
        }
    }

    public int delete(){
        if (head == tail)
            throw new IllegalStateException();
        int result = array[head];
        head++;
        size--;
        return result;
    }
    public void print(){
        copyArray = Arrays.copyOfRange(array,head,tail);
        System.out.println(Arrays.toString(copyArray));
    }
}
