package com.SixLink;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PriorityQueue {
    int[] array;
    int[] copyArray;
    int head = 0;
    int tail = 0;
    int size;
    int capacity;
    public PriorityQueue(int capacity){
        array = new int[capacity];
        this.capacity = capacity;
    }
    public void insert(int item){
        if (size == array.length)
            reSize();
        if (head == tail){
            array[tail] = item;
            tail++;
            size++;
            return;
        }
        for(int i = tail; i > head;i--){
            if (array[i-1] > item){
                array[i] = array[i-1];
                array[i-1] = item;
            }else {
                array[i] = item;
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

    public void delete(){

    }
    public void print(){
        System.out.println(Arrays.toString(array));
    }
}
